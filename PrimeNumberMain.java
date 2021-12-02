import java.util.Scanner;
import java.util.Arrays;

public class PrimeNumberMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = scanner.nextInt();
        for(int i = 2; i <= N; i++) {
            System.out.println("Prime Numbers less than or equal to " + i + " = " + Arrays.toString(getPrimeNumber(i)));
        }
        scanner.close();
    }
    private static Integer[] getPrimeNumber (final int n) {
        Integer[] arr = new Integer[n];
        int i, j, k=0;
        for(i = 2; i <= n; i++) {
            for(j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if(i == j) {
                arr[k] = i;
                k++;
            }
        }
        arr = Arrays.copyOf(arr, k);
        return arr;
    }
}
