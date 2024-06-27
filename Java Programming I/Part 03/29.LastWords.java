
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            String input = scanner.nextLine();
            String[] text = input.split(" ");
            
            System.out.println(text[text.length - 1]);
            
            if(input.equals("")) {
                break;
            }
        }

    }
}
