package modelo;

public class Filme implements Impressao
{
    private int idFilme;
    private int duracaoFilme;
    private int anoLancamento;
    private String nomeFilme;
    private String diretorFilme;
    private GeneroFilme generoFilme;

    public Filme(int idFilme, int duracaoFilme, int anoLancamento, String nomeFilme,
                 String diretorFilme, GeneroFilme generoFilme) {
        this.idFilme = idFilme;
        this.duracaoFilme = duracaoFilme;
        this.anoLancamento = anoLancamento;
        this.nomeFilme = nomeFilme;
        this.diretorFilme = diretorFilme;
        this.generoFilme = generoFilme;
    }

    public int getIdFilme() {
        return idFilme;
    }
    public void setIdFilme(int idFilme) {
        this.idFilme = idFilme;
    }
    public int getDuracaoFilme() {
        return duracaoFilme;
    }
    public void setDuracaoFilme(int duracaoFilme) {
        this.duracaoFilme = duracaoFilme;
    }
    public int getAnoLancamento() {
        return anoLancamento;
    }
    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
    public String getNomeFilme() {
        return nomeFilme;
    }
    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }
    public String getDiretorFilme() {
        return diretorFilme;
    }
    public void setDiretorFilme(String diretorFilme) {
        this.diretorFilme = diretorFilme;
    }
    public GeneroFilme getGeneroFilme() {
        return generoFilme;
    }
    public void setGeneroFilme(GeneroFilme generoFilme) {
        this.generoFilme = generoFilme;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "idFilme=" + idFilme +
                ", duracaoFilme=" + duracaoFilme +
                ", anoLancamento=" + anoLancamento +
                ", nomeFilme='" + nomeFilme + '\'' +
                ", diretorFilme='" + diretorFilme + '\'' +
                ", generoFilme=" + generoFilme +
                '}';
    }

    @Override
    public void imprimir() {
        System.out.println(this.toString());
    }
}
