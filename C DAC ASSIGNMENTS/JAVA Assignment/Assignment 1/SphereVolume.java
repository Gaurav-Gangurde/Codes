import java.util.Scanner;

public class SphereVolume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        double volume = (4.0/3.0) * Math.PI * r*r*r;

        System.out.println("Volume of sphere = " + volume);
        sc.close();
    }
}