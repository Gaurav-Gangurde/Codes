import java.util.Scanner;

public class HalfArraySum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int firstHalf = 0;
        int secondHalf = 0;

        for(int i = 0; i < n/2; i++){
            firstHalf += arr[i];
        }

        for(int i = n/2; i < n; i++){
            secondHalf += arr[i];
        }

        System.out.println("First half sum = " + firstHalf);
        System.out.println("Second half sum = " + secondHalf);
    }
}