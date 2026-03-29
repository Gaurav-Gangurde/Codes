import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal: ");
        double p = sc.nextDouble();

        System.out.print("Enter rate: ");
        double r = sc.nextDouble();

        System.out.print("Enter time: ");
        double t = sc.nextDouble();

        System.out.print("Enter number of times interest applied per year: ");
        double n = sc.nextDouble();

        double amount = p * Math.pow((1 + r/n), n*t);

        System.out.println("Compound Amount = " + amount);
        sc.close();
    }
}