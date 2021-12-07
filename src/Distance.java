import java.util.Scanner;
public class Distance {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float time_seconds;
        float meterps;
        float kmph;
        double mileph;
        float hr;
        float min;
        float sec;
        float distance;


        System.out.print("Enter your distance in meters: ");
        distance = scanner.nextFloat();

        System.out.print("Enter your time in hour: ");
        hr = scanner.nextFloat();

        System.out.print("Enter your time in minutes: ");
        min = scanner.nextFloat();

        System.out.print("Enter your time in seconds: ");
        sec = scanner.nextFloat();

        time_seconds = (hr*3600) + (min*60) + sec;
        meterps = distance / time_seconds;
        kmph = ( distance/1000 ) / ( time_seconds/3600 );
        mileph = kmph / 1.609;

        System.out.println("Your speed in meters/second is "+meterps);
        System.out.println("Your speed in km/h is "+kmph);
        System.out.println("Your speed in miles/h is "+mileph);

    }
}
