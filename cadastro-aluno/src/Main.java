import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static AlunoDAO dao = new AlunoDAO();

    public static void main(String[] args) {
        int opcao;
        do {
            exibirMenu();
            opcao = lerInt("Escolha: ");
            switch (opcao) {
                case 1 -> cadastrar();
                case 2 -> listar();
                case 3 -> buscar();
                case 4 -> editar();
                case 5 -> remover();
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    static void exibirMenu() {
        System.out.println("\n===== SISTEMA DE CADASTRO DE ALUNOS =====");
        System.out.println("1. Cadastrar aluno");
        System.out.println("2. Listar todos");
        System.out.println("3. Buscar por nome");
        System.out.println("4. Editar aluno");
        System.out.println("5. Remover aluno");
        System.out.println("0. Sair");
        System.out.println("=========================================");
    }

    static void cadastrar() {
        System.out.println("\n--- CADASTRAR ALUNO ---");
        System.out.print("Nome: "); String nome = sc.nextLine();
        int idade = lerInt("Idade: ");
        System.out.print("Turma: "); String turma = sc.nextLine();
        dao.cadastrar(new Aluno(nome, idade, turma));
    }

    static void listar() {
        System.out.println("\n--- LISTA DE ALUNOS ---");
        List<Aluno> lista = dao.listar();
        if (lista.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
        } else {
            lista.forEach(System.out::println);
            System.out.println("Total: " + lista.size() + " aluno(s)");
        }
    }

    static void buscar() {
        System.out.print("\nNome para busca: ");
        String nome = sc.nextLine();
        List<Aluno> lista = dao.buscarPorNome(nome);
        if (lista.isEmpty()) {
            System.out.println("Nenhum aluno encontrado.");
        } else {
            lista.forEach(System.out::println);
        }
    }

    static void editar() {
        listar();
        int id = lerInt("\nID do aluno a editar: ");
        System.out.print("Novo nome: ");    String nome  = sc.nextLine();
        int idade = lerInt("Nova idade: ");
        System.out.print("Nova turma: ");   String turma = sc.nextLine();
        dao.editar(new Aluno(id, nome, idade, turma));
    }

    static void remover() {
        listar();
        int id = lerInt("\nID do aluno a remover: ");
        System.out.print("Confirmar remoção? (s/n): ");
        if (sc.nextLine().equalsIgnoreCase("s")) {
            dao.remover(id);
        } else {
            System.out.println("Operação cancelada.");
        }
    }

    // Lê inteiro e já consome o \n do buffer
    static int lerInt(String msg) {
        System.out.print(msg);
        int v = sc.nextInt();
        sc.nextLine();
        return v;
    }
}