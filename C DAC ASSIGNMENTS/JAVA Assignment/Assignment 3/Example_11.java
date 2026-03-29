import java.util.Scanner;
public class Example_11 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // int num = 153;
        int temp = num;
        int sum = 0;
        
        while(num > 0){
            int digit = num % 10;
            sum = sum + (digit * digit * digit);
            num = num /10;
        }
        if(temp == sum){
            System.out.println("The Number is Armstrong!");
        }else{
            System.out.println("The Number is Not Armstrong!");
        }
    }

}