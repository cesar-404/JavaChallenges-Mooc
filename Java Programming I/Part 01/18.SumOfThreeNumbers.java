import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int numb1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int numb2 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        int numb3 = Integer.valueOf(scanner.nextLine());

        System.out.println("The sum of the numbers is " + (numb1 + numb2 + numb3));

    }
}