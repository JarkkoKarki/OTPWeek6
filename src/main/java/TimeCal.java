import java.util.Scanner;

public class TimeCal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the distance in km: ");
        int distance = scanner.nextInt();
        System.out.println("Enter speed in km/h: ");
        int speed = scanner.nextInt();
        System.out.println("The required time to reach: " + calculateTime(distance, speed));
    }

    public static double calculateTime(int x, int v) {
        return (double) x / v;
    }
}
