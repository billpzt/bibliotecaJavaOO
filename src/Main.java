import java.io.*;
import java.util.Scanner;

public class Main {
    static int i = 0; // livros
    static int j = 0; // revistas
    static int k = 0; // artigos
    static int l = 0; // CDs
    static int m = 0; // DVDs
    static String retorno;
    static Livro[] livros = new Livro[1000];
    static Revista[] revistas = new Revista[1000];
    static Artigo[] artigos = new Artigo[1000];
    static CD[] cds = new CD[1000];
    static DVD[] dvds = new DVD[1000];
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        recuperarDadosLivros(livros);
        do {
            menu();
            retorno = input.next();
            escolhaMenu(retorno);
        } while (!retorno.equals("0"));
    }
    public static void menu() {
        System.out.println("*********************************");
        System.out.println("**Sistema de Cadastro**");
        System.out.println("*********************************");
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Procurar");
        System.out.println("3 - Listar todos os livros / revistas / artigos / CDs / DVDs");
        System.out.println("4 - Quantidade cadastrada / livre");
        System.out.println("5 - Excluir elemento da lista");
        System.out.println("6 - Ordenar Livros Cadastrados");
        System.out.println("0 - Encerrar programa");
    }
    public static void escolhaMenu(String retorno) {
        switch (retorno) {
            case "1" -> Cadastrar.cadastroGeral(escolherOpcao());
            case "2" -> Procurar.procurarGeral(escolherOpcao());
            case "3" -> Listar.listarGeral(escolherOpcao());
            case "4" -> mostrarMemoria();
            case "5" -> Excluir.excluirGeral(escolherOpcao());
            case "6" -> Ordenar.ordenarGeral(escolherOpcao());
            case "0" -> salvarGeral();
            default -> System.out.println("Opção inválida, tente novamente!");
        }
    }
    public static String escolherOpcao() {
        System.out.println("Escolha a opção: ");
        System.out.println("Para livros, digite \"L\"");
        System.out.println("Para revistas, digite \"R\"");
        System.out.println("Para artigos, digite \"A\"");
        System.out.println("Para CDs, digite \"C\"");
        System.out.println("Para DVDs, digite \"D\"");
        return input.next().toLowerCase();
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
        System.out.println();
        System.out.println("Artigos:");
        System.out.println("Memória usada: " + k);
        System.out.println("Memória livre: " + (1000 - k));
        System.out.println();
        System.out.println("CDs:");
        System.out.println("Memória usada: " + l);
        System.out.println("Memória livre: " + (1000 - l));
        System.out.println();
        System.out.println("DVDs:");
        System.out.println("Memória usada: " + m);
        System.out.println("Memória livre: " + (1000 - m));

    }

    public static void salvarGeral() {
        salvarDadosLivros();
        salvarDadosRevistas();
        System.out.println("Obrigado por utilizar o programa Biblioteca!");
    }
    public static void salvarDadosLivros() {
        try {
            FileWriter arquivo = new FileWriter(new File("src", "livros.txt"));
            for (int indexSalvar=0; indexSalvar<i;indexSalvar++) {
                //arquivo.write(livros[indexSalvar].toString() + "\n");
                arquivo.write(livros[indexSalvar].dadosLivro() + "\n");
            }
            arquivo.close();
            System.out.println("Livros salvos com sucesso!");
        } catch (IOException e){
            System.out.println(e);
        }

    }
    public static void salvarDadosRevistas() {
        try {
            FileWriter arquivo = new FileWriter(new File("src", "revistas.txt"));
            for (int indexSalvar=0; indexSalvar<j;indexSalvar++) {
                arquivo.write(revistas[indexSalvar].dadosRevista() + "\n");
            }
            arquivo.close();
            System.out.println("Revistas salvas com sucesso!");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    public static void recuperarDadosLivros(Livro[] livros) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File("C:\\Users\\william.piazzetta\\IdeaProjects\\Bilbioteca\\src\\livros.txt")));
            String linha = reader.readLine();

            while (linha != null && i < livros.length) {
                String[] dados = linha.split(", ");

                if (dados.length == 9) {
                    String nomeLivro = dados[0];
                    String autor = dados[1];
                    String editora = dados[2];
                    String isbn = dados[3];
                    String prateleira = dados[4];
                    String secao = dados[5];
                    String cdd = dados[6];
                    int edicao = Integer.parseInt(dados[7]);
                    int anoPubli = Integer.parseInt(dados[8]);

                    Livro livro = new Livro(
                            nomeLivro,
                            autor,
                            editora,
                            isbn,
                            prateleira,
                            secao,
                            cdd,
                            edicao,
                            anoPubli);
                    livros[i] = livro;
                    System.out.println(livros[i]);
                } else {
                    System.out.println("Formato de linha inválido: " + linha);
                }
                linha = reader.readLine();
            }
            reader.close();
        } catch ( IOException e) {
            e.printStackTrace();
        }
    }
}