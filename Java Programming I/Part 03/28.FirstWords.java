
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            String input = scanner.nextLine();
            String[] splitedInput = input.split(" ");
            System.out.println(splitedInput[0]);
            
            if(input.equals("")) {
                break;
            }
            
        }

    }
}
