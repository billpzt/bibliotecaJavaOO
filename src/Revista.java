public class Revista extends Livro {
    public Revista(String nomeLivro, String autor, String editora, String isbn, String prateleira, String secao, String cdd, int edicao, int anoPubli, String issn) {
        super(nomeLivro, autor, editora, isbn, prateleira, secao, cdd, edicao, anoPubli);
        this.issn = issn;
    }

    public Revista() {
    }

    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    private String issn;

    public String dadosRevista() {
        String dadosDaRevista = nomeLivro + ", " + autor + ", " + editora + ", " + issn + ", " + prateleira + ", " + secao + ", " + cdd + ", " + edicao + ", " + anoPubli;
        return dadosDaRevista;
    }
}
