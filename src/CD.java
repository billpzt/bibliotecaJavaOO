public class CD {
    String artista, gravadora, album, ano, upc;

    public CD() {
    }

    public CD(String artista, String gravadora, String album, String ano, String upc) {
        this.artista = artista;
        this.gravadora = gravadora;
        this.album = album;
        this.ano = ano;
        this.upc = upc;
    }
    @Override
    public String toString() {
        return "CD{" +
                "artista='" + artista + '\'' +
                ", gravadora='" + gravadora + '\'' +
                ", album='" + album + '\'' +
                ", ano='" + ano + '\'' +
                ", upc='" + upc + '\'' +
                '}';
    }
    public String dadosArtigo() {
        String dadosDoCD = artista + ", " + gravadora + ", " + album + ", " + ano + ", " + upc;
        return dadosDoCD;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGravadora() {
        return gravadora;
    }

    public void setGravadora(String gravadora) {
        this.gravadora = gravadora;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }
}
