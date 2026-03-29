import java.util.Scanner;
public class Example_5 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println( num+ " is not a Prime Number");
        }else{
            System.out.println( num+ " is a Prime Number");
        }
    }

}