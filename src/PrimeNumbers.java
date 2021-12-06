import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Data Representation
        int num;
        int k = 0;
        int i=2;
        // User input
        System.out.print("Enter your range: ");
        num = sc.nextInt();
        for (i=2;i<=num;i++ ) {
            k = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    k = k + 1;
                }
            }

            if (k <= 2) {
                System.out.println(i);
            }

        }


    }
}
