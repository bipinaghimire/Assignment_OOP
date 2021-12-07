import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        // inputs
        double mass;
        double height;
        String massM;
        String heightH;
        double bmi;

        System.out.print("Enter your mass in kg: ");
        mass = sc.nextDouble();
        System.out.print("Enter your unit of mass: ");
        massM = sc.next();
        System.out.print("Enter your height in meter: ");
        height = sc.nextDouble();
        System.out.print("Enter your unit of height: ");
        heightH = sc.next();

        bmi = (mass/(height*height));
        if ((massM.equals("kg")) && (heightH.equals("m"))) {
            System.out.print("The BMI of given data is: " + bmi);
        }else {
            System.out.println("Invalid input unit.");

        }

    }
}
