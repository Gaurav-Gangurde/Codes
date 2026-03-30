import java.util.Scanner;
public class Example_2 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = sc1.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("It is a Leap Year");
        } else {
            System.out.println("It is not a Leap Year");
        }
        sc.close();
    }

}