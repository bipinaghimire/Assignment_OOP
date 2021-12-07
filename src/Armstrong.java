import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //input
        int num;
        System.out.print("Enter a number to check: ");
        num = sc.nextInt();

        int number = num;
        int remainder=0;
        int total=0;
        while (number !=0){
            remainder = number%10;
            total += (remainder*remainder*remainder);
            number /= 10;}
        if (total==num) {
            System.out.println(num + " is a Armstrong.");
        }else{
            System.out.println(num+" is not a Armstrong.");
        }

    }
}
