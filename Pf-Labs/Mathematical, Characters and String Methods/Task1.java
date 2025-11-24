import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double R = 6371.01; 

        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        double lat1 = input.nextDouble();
        double lon1 = input.nextDouble();

        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        double lat2 = input.nextDouble();
        double lon2 = input.nextDouble();

        double phi1 = Math.toRadians(lat1);
        double phi2 = Math.toRadians(lat2);
        double lambda1 = Math.toRadians(lon1);
        double lambda2 = Math.toRadians(lon2);

        double inner = Math.sin(phi1) * Math.sin(phi2) + Math.cos(phi1) * Math.cos(phi2) * Math.cos(lambda1 - lambda2);
        inner = Math.max(-1.0, Math.min(1.0, inner));

        double distance = R * Math.acos(inner);
        System.out.println("The distance between the two points is " + distance + " km");
    }
}
