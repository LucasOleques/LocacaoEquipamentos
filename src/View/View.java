package View;

import Controller.Controller;
import java.util.Scanner;

public class View {
    public static Controller controller = new Controller();
    public static Scanner scan;

    public View() {
    }

    public static void exibirMenu() {
        int opcao;
        do {
            System.out.println("\n*** Menu de Clientes ***");
            System.out.println("1. Adicionar Cliente");
            System.out.println("2. Alterar Cliente");
            System.out.println("3. Listar Clientes");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scan.nextInt();
            scan.nextLine();
            switch (opcao) {
                case 1:
                    controller.cadastrarCliente();
                    break;
                case 2:
                    controller.alterarCliente();
                    break;
                case 3:
                    controller.listarCliente();
                    break;
                case 4:
                    controller.removerCliente();
                case 5:
                    controller.cadastrarEquipamento();
                case 6:
                    controller.alterarEquipamento();
                case 7:
                    controller.listarEquipamento();
                case 8:
                    controller.removerEquipamento();
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    scan.nextInt(opcao);
            }
        } while(opcao != 0);

        scan.close();
    }

    static {
        scan = new Scanner(System.in);
    }
}
