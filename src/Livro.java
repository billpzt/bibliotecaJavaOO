public class Livro {
    String nomeLivro, autor, editora, isbn, prateleira, secao, cdd;
    int edicao, anoPubli;

    public Livro() {
    }

    public Livro(String nomeLivro, String autor, String editora, String isbn, String prateleira, String secao, String cdd, int edicao, int anoPubli) {
        this.nomeLivro = nomeLivro;
        this.autor = autor;
        this.editora = editora;
        this.isbn = isbn;
        this.prateleira = prateleira;
        this.secao = secao;
        this.cdd = cdd;
        this.edicao = edicao;
        this.anoPubli = anoPubli;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPrateleira() {
        return prateleira;
    }

    public void setPrateleira(String prateleira) {
        this.prateleira = prateleira;
    }

    public String getSecao() {
        return secao;
    }

    public void setSecao(String secao) {
        this.secao = secao;
    }

    public String getCdd() {
        return cdd;
    }

    public void setCdd(String cdd) {
        this.cdd = cdd;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public int getAnoPubli() {
        return anoPubli;
    }

    public void setAnoPubli(int anoPubli) {
        this.anoPubli = anoPubli;
    }
}
