public class SumPrime {
    public static void main(String[] args) {

        int sum = 0;

        for(int i = 2; i <= 100; i++){
            boolean prime = true;

            for(int j = 2; j <= i/2; j++){
                if(i % j == 0){
                    prime = false;
                    break;
                }
            }

            if(prime){
                sum = sum + i;
            }
        }

        System.out.println("Sum of prime numbers = " + sum);
    }
}