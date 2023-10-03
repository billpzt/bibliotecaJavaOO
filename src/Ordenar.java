public abstract class Ordenar {
    public static void ordenarGeral(String opcao) {
        switch (opcao) {
            case "l" -> ordenarLivros();
            case "r" -> ordenarRevistas();
            case "a" -> ordenarArtigos();
            case "c" -> ordenararCDs();
            case "d" -> ordenarDVDs();
            default -> System.out.println("Opção inválida");
        }
    }

    public static void ordenarLivros() {
        for (int x = 0; x < (Main.i - 1); x++) {
            for (int z = 0; z < (Main.i - 1); z++) {
                Livro aux = new Livro();
                Livro aux1 = new Livro();
                aux = Main.livros[z];
                aux1 = Main.livros[z + 1];
                if (aux.getNomeLivro().compareToIgnoreCase(aux1.getNomeLivro()) > 0) {
                    Main.livros[z] = aux1;
                    Main.livros[z + 1] = aux;
                }
            }
        }
    }
    public static void ordenarRevistas() {
        for (int x = 0; x < (Main.j - 1); x++) {
            for (int z = 0; z < (Main.j - 1); z++) {
                Revista aux = new Revista();
                Revista aux1 = new Revista();
                aux = Main.revistas[z];
                aux1 = Main.revistas[z + 1];
                if (aux.getNomeLivro().compareToIgnoreCase(aux1.getNomeLivro()) > 0) {
                    Main.livros[z] = aux1;
                    Main.livros[z + 1] = aux;
                }
            }
        }
    }
    private static void ordenarArtigos() {
        for (int x = 0; x < (Main.k - 1); x++) {
            for (int z = 0; z < (Main.k - 1); z++) {
                Artigo aux = new Artigo();
                Artigo aux1 = new Artigo();
                aux = Main.artigos[z];
                aux1 = Main.artigos[z + 1];
                if (aux.getDoi().compareToIgnoreCase(aux1.getDoi()) > 0) {
                    Main.artigos[z] = aux1;
                    Main.artigos[z + 1] = aux;
                }
            }
        }
    }

    private static void ordenararCDs() {
        for (int x = 0; x < (Main.l - 1); x++) {
            for (int z = 0; z < (Main.l - 1); z++) {
                CD aux = new CD();
                CD aux1 = new CD();
                aux = Main.cds[z];
                aux1 = Main.cds[z + 1];
                if (aux.getAlbum().compareToIgnoreCase(aux1.getAlbum()) > 0) {
                    Main.cds[z] = aux1;
                    Main.cds[z + 1] = aux;
                }
            }
        }
    }

    private static void ordenarDVDs() {
        for (int x = 0; x < (Main.l - 1); x++) {
            for (int z = 0; z < (Main.l - 1); z++) {
                DVD aux = new DVD();
                DVD aux1 = new DVD();
                aux = Main.dvds[z];
                aux1 = Main.dvds[z + 1];
                if (aux.getNome().compareToIgnoreCase(aux1.getNome()) > 0) {
                    Main.dvds[z] = aux1;
                    Main.dvds[z + 1] = aux;
                }
            }
        }
    }
}
