import java.util.Scanner;
import java.util.Arrays;

public class MathMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = scanner.nextInt();
        int[] inputs = new int[N];
        for(int i = 0; i < N; i++) {
            inputs[i] = scanner.nextInt();
        }

        int max = getMax(inputs);
        System.out.printf("Max element : %d in %s%n", max, Arrays.toString(inputs));

        int min = getMin(inputs);
        System.out.printf("Min element : %d in %s%n ", min, Arrays.toString(inputs));
    }
    private static int getMax(int[] arr) {
        int Max = 0x80000000;
        for(int i = 0; i < arr.length; i++) {
            Max = arr[i] > Max ? arr[i] : Max;
        }
        return Max;
    }
    private static int getMin(int[] arr) {
        int Min = 0x7fffffff;
        for(int i = 0; i < arr.length; i++) {
            Min = arr[i] < Min ? arr[i] : Min;
        }
        return Min;
    }
}
