import java.util.Scanner;

class GradeSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter percentage: ");
        int per = sc.nextInt();

        if (per < 0 || per > 100) {
            System.out.println("Invalid percentage");
        } else {
            char grade;

            if (per >= 90) grade = 'A';
            else if (per >= 80) grade = 'B';
            else if (per >= 70) grade = 'C';
            else if (per >= 60) grade = 'D';
            else grade = 'F';

            switch(grade) {
                case 'A': System.out.println("Grade A"); break;
                case 'B': System.out.println("Grade B"); break;
                case 'C': System.out.println("Grade C"); break;
                case 'D': System.out.println("Grade D"); break;
                case 'F': System.out.println("Grade F"); break;
            }
        }
    }
}