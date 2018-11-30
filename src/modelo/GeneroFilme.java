package modelo;

public enum GeneroFilme
{
    ACAO(0, "A��o"), ANIMACAO(1, "Anima��o"), COMEDIA(2, "Com�dia"),
    DRAMA(4, "Drama"), DOCUMENTARIO(5, "Document�rio"), FICCAO_CIENTIFICA(6, "Fic��o Cient�fica"),
    ROMANCE(7, "Romance"), SUSPENSE(8, "Suspense"), TERROR(9, "Terror"), RELIGIAO(9,"Religi�o");

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
