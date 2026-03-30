import java.util.Scanner;

public class Min_Max {
    public static void main(String [] args){

        // int [] arr = {22,19,78,2,50,4};
        // int n = arr.length-1;
        // int min = arr[0];
        // int max = arr[0];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int n = sc.nextInt();
        int []arr = new int[5];
        System.out.println("Enter array Elements : ");

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            
        }
        int min = arr[0];
        int max = arr[0];

        for(int i =0; i < n ; i++){
            if(arr[i] < min){
                min = arr[i];
            } if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Minimum Element :"+ min);
            System.out.println("Maximum Element :"+ max);
    }

}