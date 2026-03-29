import java.util.Scanner;
public class RandomNumber {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int random = (int) (Math.random()*10);
        int guess;
        do{
            System.out.println("Enter your Guess: ");
            guess = sc.nextInt();
            if(guess < random){
                System.out.println("To Low!");
            }else if(guess > random){
                System.out.println("To High!");
            }
        }while(guess != random);
        System.out.println("Congratulation!, Correct Number");
    }

}