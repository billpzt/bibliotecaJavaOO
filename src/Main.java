import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int i = 0;
    static int j = 0;
    static String retorno;
    static Livro[] livros = new Livro[1000];
    static Revista[] revistas = new Revista[1000];
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        do {
            menu();
            retorno = input.next();
            escolhaMenu(retorno);
        } while (!retorno.equals("0"));
    }
    public static void menu() {
        System.out.println("*********************************");
        System.out.println("**Sistema de Cadastro de Livros**");
        System.out.println("*********************************");
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Procurar");
        System.out.println("3 - Listar todos os livros / revistas");
        System.out.println("4 - Quantidade cadastrada / livre");
        System.out.println("5 - Excluir último elemento da lista");
        System.out.println("6 - Ordenar Livros Cadastrados");
        System.out.println("0 - Encerrar programa");
    }
    public static void escolhaMenu(String retorno) {
        switch (retorno) {
            case "1" -> cadastroGeral(escolherOpcao());
            case "2" -> procurarGeral(escolherOpcao());
            case "3" -> listarGeral(escolherOpcao());
            case "4" -> mostrarMemoria();
            case "5" -> excluirGeral(escolherOpcao());
            case "6" -> ordenarGeral(escolherOpcao());
            case "0" -> System.out.println("Obrigado por utilizar o programa Biblioteca!");
        }
    }
    public static String escolherOpcao() {
        System.out.println("Escolha a opção: ");
        System.out.println("Para livros, digite \"L\"");
        System.out.println("Para revistas, digite \"R\"");
        return input.next().toLowerCase();
    }
    // opção 1 do menu
    public static void cadastroGeral(String opcao) {
        switch (opcao) {
            case "l" -> cadastrarLivro();
            case "r" -> cadastrarRevista();
            default -> System.out.println("Opção inválida");
        }
    }
    // opção 1 do menu
    public static void cadastrarLivro() {
        livros[i] = new Livro();
        input.nextLine(); // Consume the leftover newline from previous input
        System.out.print("Digite o nome do livro: ");
        livros[i].setNomeLivro(input.nextLine());
        System.out.print("Digite o autor: ");
        livros[i].setAutor(input.nextLine());
        System.out.print("Digite a editora: ");
        livros[i].setEditora(input.nextLine());
        System.out.print("Digite o ISBN: ");
        livros[i].setIsbn(input.nextLine());
        System.out.print("Digite a prateleira: ");
        livros[i].setPrateleira(input.nextLine());
        System.out.print("Digite a seção: ");
        livros[i].setSecao(input.nextLine());
        System.out.print("Digite o CDD: ");
        livros[i].setCdd(input.nextLine());
        System.out.print("Digite a edição: ");
        livros[i].setEdicao(Integer.parseInt(input.nextLine()));
        System.out.print("Digite o ano de publicação: ");
        livros[i].setAnoPubli(Integer.parseInt(input.nextLine()));
        i++;
    }
    // opção 1 do menu
    public static void cadastrarRevista() {
        revistas[j] = new Revista();
        input.nextLine(); // Consume the leftover newline from previous input
        System.out.print("Digite o nome do livro: ");
        revistas[j].setNomeLivro(input.nextLine());
        System.out.print("Digite o autor: ");
        revistas[j].setAutor(input.nextLine());
        System.out.print("Digite a editora: ");
        revistas[j].setEditora(input.nextLine());
        System.out.print("Digite o ISSN: ");
        revistas[j].setIssn(input.nextLine());
        System.out.print("Digite a prateleira: ");
        revistas[j].setPrateleira(input.nextLine());
        System.out.print("Digite a seção: ");
        revistas[j].setSecao(input.nextLine());
        System.out.print("Digite o CDD: ");
        revistas[j].setCdd(input.nextLine());
        System.out.print("Digite a edição: ");
        revistas[j].setEdicao(Integer.parseInt(input.nextLine()));
        System.out.print("Digite o ano de publicação: ");
        revistas[j].setAnoPubli(Integer.parseInt(input.nextLine()));
        j++;
    }
    public static void procurarGeral(String opcao) {
        switch (opcao) {
            case "l" -> procurarLivro();
            case "r" -> procurarRevista();
            default -> System.out.println("Opção inválida");
        }
    }
    public static void procurarLivro() {
        String termoBusca;
        String nomeLivro;
        ArrayList<Livro> livrosAchados = new ArrayList<>();

        System.out.println("Digite o termo procurado: ");
        termoBusca = input.next();
        termoBusca = termoBusca.toLowerCase();

        for (int index = 0; index < i; index++) {
            nomeLivro = livros[index].getNomeLivro();
            System.out.println(index);
            if (nomeLivro.toLowerCase().contains(termoBusca)) {
                livrosAchados.add(livros[index]);
                System.out.println(livros[index].getNomeLivro());
            }
        }
        System.out.println("Livros encontrados: ");
        for (Livro livro : livrosAchados) {
            System.out.println(livro.toString());
        }
    }
    public static void procurarRevista() {
        String termoBusca;
        String nomeRevista;
        ArrayList<Revista> revistasAchadas = new ArrayList<>();

        System.out.println("Digite o termo procurado: ");
        termoBusca = input.next();
        termoBusca = termoBusca.toLowerCase();

        for (int index = 0; index < i; index++) {
            nomeRevista = livros[index].getNomeLivro();
            System.out.println(index);
            if (nomeRevista.toLowerCase().contains(termoBusca)) {
                revistasAchadas.add(revistas[index]);
                System.out.println(revistas[index].getNomeLivro());
            }
        }
        System.out.println("Revistas encontrados: ");
        for (Livro livro : revistasAchadas) {
            System.out.println(livro.toString());
        }
    }
    public static void listarGeral(String opcao) {
        switch (opcao) {
            case "l" -> listarTodosOsLivros(livros);
            case "r" -> listarTodasAsRevistas(revistas);
            default -> System.out.println("Opção inválida");
        }
    }
    // opção 4 do menu
    public static void listarTodosOsLivros(Livro[] livros) {
        for (int index = 0; index < i; index++) {
            System.out.println("Livro" + index);
            System.out.println(
                    livros[index].getNomeLivro() + ", " +
                    livros[index].getAutor() + ", " +
                    livros[index].getIsbn() + ", " +
                    livros[index].getCdd() + ", " +
                    livros[index].getEditora() + ", " +
                    livros[index].getEdicao() + ", " +
                    livros[index].getPrateleira() + ", " +
                    livros[index].getAnoPubli()
            );
        }
    }
    public static void listarTodasAsRevistas(Revista[] revistas) {
        for (int index = 0; index < j; index++) {
            System.out.println("Livro" + index);
            System.out.println(
                    revistas[index].getNomeLivro() + ", " +
                    revistas[index].getAutor() + ", " +
                    revistas[index].getIssn() + ", " +
                    revistas[index].getCdd() + ", " +
                    revistas[index].getEditora() + ", " +
                    revistas[index].getEdicao() + ", " +
                    revistas[index].getPrateleira() + ", " +
                    revistas[index].getAnoPubli()
            );
        }
    }
    public static void mostrarMemoria() {
        System.out.println("Total: 1000");
        System.out.println("Livros:");
        System.out.println("Memória usada: " + i);
        System.out.println("Memória livre: " + (1000 - i));
        System.out.println();
        System.out.println("Revistas:");
        System.out.println("Memória usada: " + j);
        System.out.println("Memória livre: " + (1000 - j));

    }
    public static void excluirGeral(String opcao) {
        switch (opcao) {
            case "l" -> excluirUltimoLivro();
            case "r" -> excluirUltimaRevista();
            default -> System.out.println("Opção inválida");
        }
    }
    public static void excluirUltimoLivro() {
        if(i>0) {
            i--;
        }
    }
    public static void excluirUltimaRevista() {
        if(i>0) {
            j--;
        }
    }
    public static void ordenarGeral(String opcao) {
        switch (opcao) {
            case "l" -> ordenarLivros();
            case "r" -> ordenarRevistas();
            default -> System.out.println("Opção inválida");
        }
    }
    public static void ordenarLivros() {
        for (int k=0;k<(i-1);k++) {
            for (int z=0;z<(i-1);z++) {
                Livro aux=new Livro();
                Livro aux1= new Livro();
                aux=livros[z];
                aux1=livros[z+1];
                if(aux.getNomeLivro().compareToIgnoreCase(aux1.getNomeLivro()) > 0) {
                    livros[z] = aux1;
                    livros[z+1] = aux;
                }
            }
        }
        // (myStr1.toLowerCase().compareTo(myStra2.toLowerCase())<0;
//        String titulo1, titulo2;
//        Livro livroTemp;
//        for (int ord=0; ord<(i-1); ord++) {
//            titulo1 = livros[ord].getNomeLivro();
//            titulo2 = livros[ord+1].getNomeLivro();
//            if((titulo1.toLowerCase().compareTo(titulo2.toLowerCase())) < 0) {
//                livroTemp = livros[ord];
//                livros[ord] = livros[ord+1];
//                livros[ord+1] = livroTemp;
//            }
//        }
    }
    public static void ordenarRevistas() {
        for (int r=0;r<(i-1);r++) {
            for (int z=0;z<(i-1);z++) {
                Revista aux=new Revista();
                Revista aux1= new Revista();
                aux=revistas[z];
                aux1=revistas[z+1];
                if(aux.getNomeLivro().compareToIgnoreCase(aux1.getNomeLivro()) > 0) {
                    livros[z] = aux1;
                    livros[z+1] = aux;
                }
            }
        }
}