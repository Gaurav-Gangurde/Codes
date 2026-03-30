import java.util.Scanner;
public class ElementSearch {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter Size : ");
         int n = sc.nextInt();
         int arr[]= new int[n];
         System.out.println("Enter array elements: ");

         for(int i = 0; i < n;i++){
             arr[i]= sc.nextInt();
         }
         System.out.println("Enter Search element : ");
         int key = sc.nextInt();

         boolean found = false;

         for(int i = 0; i<n; i++){
             if(arr[i] == key ){
                System.out.println("Element found at index "+ i);
                found = true;
                break;
             }
         }
         if(!found){
            System.out.println("Element Not found in Array!");
            }


        
}
}