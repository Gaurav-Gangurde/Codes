
public class Example_10 {
    public static void main(String [] args){
        int sum = 0;
        for(int i = 0 ; i<=50; i++){
            if(i % 2 == 0){
                System.out.print(i+" ");
                sum = sum +i ;
            }
        }
        System.out.println("\nEven Number Sum is : "+sum);
    }

}