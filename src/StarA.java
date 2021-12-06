import java.util.Scanner;

public class StarA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows;
        int columns;

        System.out.print("Enter how many number of rows you want: ");
        rows = sc.nextInt();
        System.out.print("Enter how many number of columns you want: ");
        columns = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                if (i == 1 || i == rows || j == 1 || j == columns) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}
