import java.util.Scanner;

public class PangramCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase();

        boolean[] alphabet = new boolean[26];

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(ch >= 'a' && ch <= 'z') {
                alphabet[ch - 'a'] = true;
            }
        }

        boolean isPangram = true;

        for(int i = 0; i < 26; i++) {
            if(!alphabet[i]) {
                isPangram = false;
                break;
            }
        }

        if(isPangram)
            System.out.println("The string is a Pangram");
        else
            System.out.println("The string is NOT a Pangram");

        sc.close();
    }
}