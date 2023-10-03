public abstract class Listar {
    public static void listarGeral(String opcao) {
        switch (opcao) {
            case "l" -> listarTodosOsLivros(Main.livros);
            case "r" -> listarTodasAsRevistas(Main.revistas);
            case "a" -> listarTodosOsArtigos(Main.artigos);
            case "c" -> listarTodosOsCDs(Main.cds);
            case "d" -> listarTodosOsDVDs(Main.dvds);
            default -> System.out.println("Opção inválida");
        }
    }
    // opção 4 do menu
    public static void listarTodosOsLivros(Livro[] livros) {
        for (int index = 0; index < Main.i; index++) {
            System.out.println("Livro" + index);
            System.out.println(livros[index].dadosLivro());
        }
    }
    public static void listarTodasAsRevistas(Revista[] revistas) {
        for (int index = 0; index < Main.j; index++) {
            System.out.println("Livro" + index);
            System.out.println(revistas[index].dadosRevista());
        }
    }
    public static void listarTodosOsArtigos(Artigo[] artigos) {
        for (int index = 0; index < Main.k; index++) {
            System.out.println("Artigo" + index);
            System.out.println(artigos[index].dadosArtigo());
        }
    }
    public static void listarTodosOsCDs(CD[] cds) {
        for (int index = 0; index < Main.l; index++) {
            System.out.println("CD" + index);
            System.out.println(cds[index].dadosCD());
        }
    }
    public static void listarTodosOsDVDs(DVD[] dvds) {
        for (int index = 0; index < Main.m; index++) {
            System.out.println("DVD" + index);
            System.out.println(dvds[index].dadosDVD());
        }
    }
}
