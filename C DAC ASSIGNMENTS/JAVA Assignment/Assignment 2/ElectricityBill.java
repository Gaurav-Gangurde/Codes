import java.util.Scanner;

class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter units: ");
        int units = sc.nextInt();

        if (units < 0) {
            System.out.println("Invalid units");
            return;
        }

        double bill;

        if (units <= 100)
            bill = units * 5;
        else if (units <= 200)
            bill = units * 6;
        else if (units <= 300)
            bill = units * 7;
        else
            bill = units * 8;

        System.out.println("Bill: ₹" + bill);
    }
}