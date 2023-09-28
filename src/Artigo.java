public class Artigo {
    String doi, chave, tema, autor, ano, instituto;

    public Artigo() {
    }

    public Artigo(String doi, String chave, String tema, String autor, String ano, String instituto) {
        this.doi = doi;
        this.chave = chave;
        this.tema = tema;
        this.autor = autor;
        this.ano = ano;
        this.instituto = instituto;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "doi='" + doi + '\'' +
                ", chave='" + chave + '\'' +
                ", tema='" + tema + '\'' +
                ", autor='" + autor + '\'' +
                ", ano='" + ano + '\'' +
                ", instituto='" + instituto +
                '}';
    }
    public String dadosArtigo() {
        String dadosDoArtigo = doi + ", " + chave + ", " + tema + ", " + autor + ", " + ano + ", " + instituto + ", ";
        return dadosDoArtigo;
    }

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getInstituto() {
        return instituto;
    }

    public void setInstituto(String instituto) {
        this.instituto = instituto;
    }

    public String getDoi() {
        return doi;
    }

    public void setDoi(String doi) {
        this.doi = doi;
    }
}
