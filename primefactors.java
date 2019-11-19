import java.util.Arrays;
import java.util.Scanner;

public class primefactors {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = reader.nextInt();
        reader.close();
        int[] answer = generate(n);
        System.out.println(Arrays.toString(answer));
    }

    public static int[] generate(int n) {
        int[] a = new int[n / 2];

        int i = 1;
        int j;
        for (j = 0; i <= n / 2; i++) {
            if (n % i == 0) {
                a[j] = i;
                j++;
            }
        }
        int[] b = new int[j];
        for (int k = 0; k < j; k++) {
            b[k] = a[k];
        }
        return b;
    }
}

