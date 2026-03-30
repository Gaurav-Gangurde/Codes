import java.util.Scanner;
public class ArrayReverse {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size :");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter Array Element :");

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();

        }
        System.out.println("reverse Array :");
        for(int i = n-1; i >=0;i--){
            System.out.print(arr[i]+" ");
        }


    }

}