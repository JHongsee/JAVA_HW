import java.util.Scanner;

enum Command { ADD, LIST, SRTA, SRTD, SUM, QUIT, INVALID }
enum Order { ASC, DES }
public class ArrayEnum {
    public static void main(String args[]) {
        int index = 0;
        int[] values = new int[100];
        final Scanner scanner = new Scanner(System.in);

        while(true) {
            final Command command = getCommand(scanner);
            if(command == Command.QUIT) {
                System.out.println("Bye!");
                break;
            }
            switch(command) {
                case ADD:
                    final int newValue = getValue(scanner);
                    values[index] = newValue;
                    index++;
                    break;
                case LIST:
                    printLIST(values, index);
                    break;
                case SRTA:
                    printLIST(sort(values, index, Order.ASC), index);
                    break;
                case SRTD:
                    printLIST(sort(values, index, Order.DES), index);
                    break;
                case SUM:
                    printSUM(values, index);
                    break;
                case INVALID:
                    System.out.println("Invalid Command");
                    break;
                default:
                    break;
            }
        }
    }

    private static Command getCommand(Scanner scanner) {
        String a = scanner.next().toUpperCase();
        Command command;
        try { command = Command.valueOf(a); }
        catch(IllegalArgumentException e) { command = Command.INVALID; }

        return command;
    }

    private static int getValue(Scanner scanner) {
        int a = scanner.nextInt();
        return a;
    }

    private static void printLIST(int[] arr, int N) {
        for(int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void printSUM(int[] arr, int N) {
        int sum = 0;
        for(int i = 0; i < N; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }

    private static int[] sort(int[] arr1, int N, Order order) {
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) arr[i] = arr1[i];
        switch(order) {
            case ASC:
                for (int i = 0; i < N - 1; i++) {
                    for (int j = 0; j < N - 1 - i; j++) {
                        if (arr[j] > arr[j + 1]) {
                            int temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                        }
                    }
                }
                break;
            case DES:
                for (int i = 0; i < N - 1; i++) {
                    for (int j = 0; j < N - 1 - i; j++) {
                        if (arr[j] < arr[j + 1]) {
                            int temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                        }
                    }
                }
                break;
            default:
                break;
        }
        return arr;
    }
}
