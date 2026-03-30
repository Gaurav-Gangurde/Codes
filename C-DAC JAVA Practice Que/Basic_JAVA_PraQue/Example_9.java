
public class Example_9 {
    public static void main(String [] args){
        int sum = 0;
        for(int i = 0 ; i<=50; i++){
            if(i % 2 == 1){
                System.out.print(i+" ");
                sum = sum +i ;
            }
        }
        System.out.println("\nOdd Number Sum is : "+sum);
    }

}