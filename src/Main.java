import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Undo undo = Undo.getInstance();
        Scanner scanner = new Scanner(System.in);
        boolean ejecucion = true;

        while (ejecucion) {
            System.out.print("Introduce un comando ('add', 'remove', 'list', 'exit'): ");
            String opcion = scanner.nextLine();

            switch (opcion) {
                case "add":
                    System.out.print("Introduce el producto a añadir: ");
                    String commandToAdd = scanner.nextLine();
                    undo.addPedido(commandToAdd);
                    break;
                case "remove":
                    System.out.print("Introduce el producto a eliminar: ");
                    String commandToRemove = scanner.nextLine();
                    undo.removePedido(commandToRemove);
                    break;
                case "list":
                    System.out.println("Últimos productos introducidos:");
                    undo.listPedido();
                    break;
                case "exit":
                    ejecucion = false;
                    break;
                default:
                    System.out.println("Comando inválido");
                    break;
            }
        }
    }
}