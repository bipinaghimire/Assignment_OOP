import java.util.Scanner;
public class StarB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // user input
        int row;
        System.out.println("Enter how many rows you want : ");
        row = sc.nextInt();

        //loop for pyramid

        for (int i=0; i<row; i++)
        {
            for (int j=row-i; j>1; j--)
            {
                System.out.print(" ");
            }
            for (int j=0; j<=i; j++ )
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
