import java.util.Scanner;

class TrafficLight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter (R/Y/G): ");
        char ch = sc.next().charAt(0);

        switch(Character.toUpperCase(ch)) {
            case 'R': System.out.println("Stop"); break;
            case 'Y': System.out.println("Wait"); break;
            case 'G': System.out.println("Go"); break;
            default: System.out.println("Invalid input");
        }
    }
}