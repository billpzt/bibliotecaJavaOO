public abstract class Procurar {
    public static void procurarGeral(String opcao) {
        switch (opcao) {
            case "l" -> procurarLivro();
            case "r" -> procurarRevista();
            case "a" -> procurarArtigo();
            case "c" -> procurarCD();
            case "d" -> procurarDVD();
            default -> System.out.println("Opção inválida");
        }
    }
    // Função 2 do menu
    public static void procurarLivro() {
        String termoBusca;
        String nomeLivro;

        System.out.println("Digite o termo procurado: ");
        termoBusca = Main.input.next();
        termoBusca = termoBusca.toLowerCase();

        System.out.println("Livros encontrados: ");
        for (int index = 0; index < Main.i; index++) {
            nomeLivro = Main.livros[index].getNomeLivro();
            if (nomeLivro.toLowerCase().contains(termoBusca)) {
                System.out.println(index + " " + Main.livros[index].getNomeLivro());
            }
        }
    }
    // Função 2 do menu
    public static void procurarRevista() {
        String termoBusca;
        String nomeRevista;

        System.out.println("Digite o termo procurado: ");
        termoBusca = Main.input.next();
        termoBusca = termoBusca.toLowerCase();

        System.out.println("Revistas encontradas: ");
        for (int index = 0; index < Main.i; index++) {
            nomeRevista = Main.livros[index].getNomeLivro();
            if (nomeRevista.toLowerCase().contains(termoBusca)) {
                System.out.println(index + " " + Main.revistas[index].getNomeLivro());
            }
        }
    }
    public static void procurarArtigo() {
        String termoBusca;
        String chave;

        System.out.println("Digite o termo procurado: ");
        termoBusca = Main.input.next();
        termoBusca = termoBusca.toLowerCase();

        System.out.println("Artigos encontrados: ");
        for (int index = 0; index < Main.i; index++) {
            chave = Main.artigos[index].getChave();
            if (chave.toLowerCase().contains(termoBusca)) {
                System.out.println(index + " " + Main.artigos[index].getChave());
            }
        }
    }
    public static void procurarCD() {
        String termoBusca;
        String album;

        System.out.println("Digite o termo procurado: ");
        termoBusca = Main.input.next();
        termoBusca = termoBusca.toLowerCase();

        System.out.println("Albuns encontrados: ");
        for (int index = 0; index < Main.i; index++) {
            album = Main.cds[index].getAlbum();
            if (album.toLowerCase().contains(termoBusca)) {
                System.out.println(index + " " + Main.cds[index].getAlbum());
            }
        }
    }
    public static void procurarDVD() {
        String termoBusca;
        String nome;

        System.out.println("Digite o termo procurado: ");
        termoBusca = Main.input.next();
        termoBusca = termoBusca.toLowerCase();

        System.out.println("DVDs encontrados: ");
        for (int index = 0; index < Main.i; index++) {
            nome = Main.dvds[index].getNome();
            if (nome.toLowerCase().contains(termoBusca)) {
                System.out.println(index + " " + Main.dvds[index].getNome());
            }
        }
    }
}
