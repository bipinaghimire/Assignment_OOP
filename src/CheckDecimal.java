import java.util.Scanner;

public class CheckDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // inputs
        float num1;
        float num2;

        System.out.print("Enter first number to check: ");
        num1 = sc.nextFloat();
        System.out.print("Enter second number to check: ");
        num2 = sc.nextFloat();
        float result = num1-num2;

        if (result <= 0.01) {
            System.out.println("These numbers are the same.");
        }
        else {
            System.out.println("These numbers are different.");
        }
    }
}
