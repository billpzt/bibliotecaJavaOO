public abstract class Excluir {
    public static void excluirGeral(String opcao) {
        switch (opcao) {
            case "l" -> excluirLivro();
            case "r" -> excluirRevista();
            case "a" -> excluirArtigo();
            case "c" -> excluirCD();
            case "d" -> excluirDVD();
            default -> System.out.println("Opção inválida");
        }
    }
    public static void excluirLivro() {
        listarOuBuscarLivros(escolherListarBuscar());

        int posicao=0,k=0;
        System.out.print("Digite a posição do elemento a ser excluido: ");
        try {
            posicao = Main.input.nextInt();
        } catch (Exception e) {
            System.out.println("Entrada incorreta");
        }
        if((posicao <= Main.i && posicao >= 0)) {
            Main.i--;
            for (k = posicao; k<= Main.i; k++) {
                Main.livros[k] = Main.livros[k+1];
            }
            Main.livros[k+1]=null;
        }
    }
    public static void excluirRevista() {
        listarOuBuscarRevistas(escolherListarBuscar());

        int posicao=0,k=0;
        System.out.print("Digite a posição do elemento a ser excluido: ");
        try {
            posicao = Main.input.nextInt();
        } catch (Exception e) {
            System.out.println("Entrada incorreta");
        }
        if((posicao <= Main.i && posicao >= 0)) {
            Main.i--;
            for (k = posicao; k<= Main.i; k++) {
                Main.revistas[k] = Main.revistas[k+1];
            }
            Main.revistas[k+1]=null;
        }
    }
    private static void excluirArtigo() {
    }
    private static void excluirCD() {
    }
    private static void excluirDVD() {
    }
    public static String escolherListarBuscar() {
        System.out.println("Escolha a opção: ");
        System.out.println("Para listar tudo, digite \"L\"");
        System.out.println("Para busca por palavra-chave, digite \"B\"");
        return Main.input.next().toLowerCase();
    }
    public static void listarOuBuscarLivros(String opcao) {
        switch (opcao) {
            case "l" -> Listar.listarTodosOsLivros(Main.livros);
            case "b" -> Procurar.procurarLivro();
            default -> System.out.println("Opção inválida");
        }
    }
    public static void listarOuBuscarRevistas(String opcao) {
        switch (opcao) {
            case "l" -> Listar.listarTodasAsRevistas(Main.revistas);
            case "b" -> Procurar.procurarRevista();
            default -> System.out.println("Opção inválida");
        }
    }
    public static void listarOuBuscarCDs(String opcao) {
        switch (opcao) {
            case "l" -> Listar.listarTodosOsCDs(Main.cds);
            case "b" -> Procurar.procurarCD();
            default -> System.out.println("Opção inválida");
        }
    }
    public static void listarOuBuscarDVDs(String opcao) {
        switch (opcao) {
            case "l" -> Listar.listarTodosOsDVDs(Main.dvds);
            case "b" -> Procurar.procurarDVD();
            default -> System.out.println("Opção inválida");
        }
    }
}
