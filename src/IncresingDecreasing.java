import java.util.Scanner;

public class IncresingDecreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        int num3;

        System.out.println("Enter first number: ");
        num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        num2 = sc.nextInt();
        System.out.println("Enter third number: ");
        num3 = sc.nextInt();

        if (num1 < num2 && num2 < num3)
        {
            System.out.println("It is in increasing order");
        }
        else if (num1 > num2 && num2 > num3)
        {
            System.out.println("It is in decreasing order");
        }
        else
        {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
