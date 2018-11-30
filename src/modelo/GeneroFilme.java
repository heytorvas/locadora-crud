package modelo;

public enum GeneroFilme
{
    ACAO(0, "Ação"), ANIMACAO(1, "Animação"), COMEDIA(2, "Comédia"),
    DRAMA(4, "Drama"), DOCUMENTARIO(5, "Documentário"), FICCAO_CIENTIFICA(6, "Ficção Científica"),
    ROMANCE(7, "Romance"), SUSPENSE(8, "Suspense"), TERROR(9, "Terror"), RELIGIAO(9,"Religião");

    // atributos
    private int id;
    private String nome;

    // construtor
    private GeneroFilme(int id, String nome)
    {
        this.id = id;
        this.nome = nome;
    }

    // getters
    public int getId()
    {
        return id;
    }
    public String getNome()
    {
        return nome;
    }
}
