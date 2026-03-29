import java.util.Scanner;

public class AverageNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        System.out.println("Enter 5 numbers:");

        for(int i = 1; i <= 5; i++){
            int num = sc.nextInt();
            sum = sum + num;
        }

        double avg = sum / 5.0;

        System.out.println("Average = " + avg);
    }
}