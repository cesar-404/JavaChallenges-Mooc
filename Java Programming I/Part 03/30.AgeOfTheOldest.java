
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int old = 0;
        
        while(true) {
            String input = scanner.nextLine();
            String[] text = input.split(",");
            
            if(input.equals("")) {
                break;
            }
            
            int age = Integer.parseInt(text[1]);
            if(old < age) {
                old = age;
            }
        }
        
        System.out.println("Age of the oldest: "+old);
    }
}
