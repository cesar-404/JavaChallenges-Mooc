import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give the first number:");
        int numb1 = Integer.valueOf(scan.nextLine());
        System.out.println("Give the second number:");
        int numb2 = Integer.valueOf(scan.nextLine());

        if (numb1 > numb2) {
            System.out.println("Greater number is: " + numb1);
        } else if (numb1 < numb2) {
            System.out.println("Greater number is: " + numb2);
        } else {
            System.out.println("The numbers are equal!");
        }

    }
}