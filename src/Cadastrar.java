public abstract class Cadastrar {
    public static void cadastroGeral(String opcao) {
        switch (opcao) {
            case "l" -> Cadastrar.cadastrarLivro();
            case "r" -> Cadastrar.cadastrarRevista();
            case "a" -> Cadastrar.cadastrarArtigo();
            case "c" -> Cadastrar.cadastrarCD();
            case "d" -> Cadastrar.cadastrarDVD();
            default -> System.out.println("Opção inválida");
        }
    }
    // opção 1 do menu
    public static void cadastrarLivro() {
        Main.livros[Main.i] = new Livro();
        Main.input.nextLine(); // Consume the leftover newline from previous input
        System.out.print("Digite o nome do livro: ");
        Main.livros[Main.i].setNomeLivro(Main.input.nextLine());
        System.out.print("Digite o autor: ");
        Main.livros[Main.i].setAutor(Main.input.nextLine());
        System.out.print("Digite a editora: ");
        Main.livros[Main.i].setEditora(Main.input.nextLine());
        System.out.print("Digite o ISBN: ");
        Main.livros[Main.i].setIsbn(Main.input.nextLine());
        System.out.print("Digite a prateleira: ");
        Main.livros[Main.i].setPrateleira(Main.input.nextLine());
        System.out.print("Digite a seção: ");
        Main.livros[Main.i].setSecao(Main.input.nextLine());
        System.out.print("Digite o CDD: ");
        Main.livros[Main.i].setCdd(Main.input.nextLine());
        System.out.print("Digite a edição: ");
        Main.livros[Main.i].setEdicao(Integer.parseInt(Main.input.nextLine()));
        System.out.print("Digite o ano de publicação: ");
        Main.livros[Main.i].setAnoPubli(Integer.parseInt(Main.input.nextLine()));
        Main.i++;
    }
    // opção 1 do menu
    public static void cadastrarRevista() {
        Main.revistas[Main.j] = new Revista();
        Main.input.nextLine(); // Consume the leftover newline from previous input
        System.out.print("Digite o nome do livro: ");
        Main.revistas[Main.j].setNomeLivro(Main.input.nextLine());
        System.out.print("Digite o autor: ");
        Main.revistas[Main.j].setAutor(Main.input.nextLine());
        System.out.print("Digite a editora: ");
        Main.revistas[Main.j].setEditora(Main.input.nextLine());
        System.out.print("Digite o ISSN: ");
        Main.revistas[Main.j].setIssn(Main.input.nextLine());
        System.out.print("Digite a prateleira: ");
        Main.revistas[Main.j].setPrateleira(Main.input.nextLine());
        System.out.print("Digite a seção: ");
        Main.revistas[Main.j].setSecao(Main.input.nextLine());
        System.out.print("Digite o CDD: ");
        Main.revistas[Main.j].setCdd(Main.input.nextLine());
        System.out.print("Digite a edição: ");
        Main.revistas[Main.j].setEdicao(Integer.parseInt(Main.input.nextLine()));
        System.out.print("Digite o ano de publicação: ");
        Main.revistas[Main.j].setAnoPubli(Integer.parseInt(Main.input.nextLine()));
        Main.j++;
    }
    public static void cadastrarArtigo() {
        Main.artigos[Main.k] = new Artigo();
        Main.input.nextLine(); // Consume the leftover newline from previous input
        System.out.print("Digite o DOI: ");
        Main.artigos[Main.k].setDoi(Main.input.nextLine());
        System.out.print("Digite a chave: ");
        Main.artigos[Main.k].setChave(Main.input.nextLine());
        System.out.print("Digite o tema: ");
        Main.artigos[Main.k].setTema(Main.input.nextLine());
        System.out.print("Digite o autor: ");
        Main.artigos[Main.k].setAutor(Main.input.nextLine());
        System.out.print("Digite o ano: ");
        Main.artigos[Main.k].setAno(Main.input.nextLine());
        System.out.print("Digite o instituto: ");
        Main.artigos[Main.k].setInstituto(Main.input.nextLine());
        Main.k++;
    }
    public static void cadastrarCD() {
        Main.cds[Main.l] = new CD();
        Main.input.nextLine(); // Consume the leftover newline from previous input
        System.out.print("Digite o artista: ");
        Main.cds[Main.l].setArtista(Main.input.nextLine());
        System.out.print("Digite a gravadora: ");
        Main.cds[Main.l].setGravadora(Main.input.nextLine());
        System.out.print("Digite o album: ");
        Main.cds[Main.l].setAlbum(Main.input.nextLine());
        System.out.print("Digite o ano: ");
        Main.cds[Main.l].setAno(Main.input.nextLine());
        System.out.print("Digite o UPC: ");
        Main.cds[Main.l].setUpc(Main.input.nextLine());
        Main.l++;
    }
    public static void cadastrarDVD() {
        Main.dvds[Main.m] = new DVD();
        Main.input.nextLine(); // Consume the leftover newline from previous input
        System.out.print("Digite o nome: ");
        Main.dvds[Main.m].setNome(Main.input.nextLine());
        System.out.print("Digite a distribuidora: ");
        Main.dvds[Main.m].setDistribuidora(Main.input.nextLine());
        System.out.print("Digite o duração: ");
        Main.dvds[Main.m].setDuracao(Main.input.nextLine());
        System.out.print("Digite o sinopse: ");
        Main.dvds[Main.m].setSinopse(Main.input.nextLine());
        System.out.print("Digite o bonus: ");
        Main.dvds[Main.m].setBonus(Main.input.nextLine());
        System.out.print("Digite o ano: ");
        Main.dvds[Main.m].setAno(Main.input.nextLine());
        System.out.print("Digite o gênero: ");
        Main.dvds[Main.m].setGenero(Main.input.nextLine());
        System.out.print("Digite o UPC: ");
        Main.dvds[Main.m].setUpc(Main.input.nextLine());
        Main.m++;
    }
}
