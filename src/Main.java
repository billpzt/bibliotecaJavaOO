import java.util.Scanner;

public class Main {
    static int i = 0;
    static int j = 0;
    static Livro[] livros = new Livro[1000];
    static Revista[] revistas = new Revista[1000];
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        String retorno;

        do {
            System.out.println("*********************************");
            System.out.println("**Sistema de Cadastro de Livros**");
            System.out.println("*********************************");
            System.out.println("1 - Cadastrar livro");
            System.out.println("2 - Cadastrar Revista");
            System.out.println("3 - Procurar livro");
            System.out.println("4 - Listar todos os livros");
            System.out.println("5 - Listar todas as revistas");
            System.out.println("6 - Quantidade cadastrada / livre");
            System.out.println("7 - Excluir último elemento da lista");
            System.out.println("8 - Ordenar Livros Cadastrados");
            System.out.println("0 - Encerrar programa");

            retorno = input.next();

            switch (retorno) {
                case "1":
                    cadastrarLivro();
                    break;
                case "2":
                    cadastrarRevista();
                    break;
                case "3":
                    System.out.println("Opção ainda não implementada");
                    break;
                case "4":
                    listarTodosOsLivros(livros);
                    break;
                case "5":
                    listarTodasAsRevistas(revistas);
                    break;
                case "6":
                    mostrarMemoria();
                    break;
                case "7":
                    excluirUltimoElemento();
                    break;
                case "8":
                    System.out.println("Opção ainda não implementada");
                    break;
                case "0":
                    System.out.println("Obrigado por utilizar o programa Biblioteca!");
                    break;
            }

        } while (!retorno.equals("0"));
    }
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
    public static void listarTodosOsLivros(Livro livros[]) {
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
    public static void listarTodasAsRevistas(Revista revistas[]) {
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
        System.out.println("");
        System.out.println("Revistas:");
        System.out.println("Memória usada: " + j);
        System.out.println("Memória livre: " + (1000 - j));

    }

    public static void excluirUltimoElemento() {
        if(i>0) {
            i--;
        }
    }
}