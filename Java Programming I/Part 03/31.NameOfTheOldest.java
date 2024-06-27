
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int old = 0;
        String oldest = "";
        
        while(true) {
            String input = scanner.nextLine();
            String[] text = input.split(",");
            
            if(input.equals("")) {
                break;
            }
            
            int age = Integer.parseInt(text[1]);
            if(old < age) {
                old = age;
                oldest = text[0];
            }
        }
        
        System.out.println("Name of the oldest: "+oldest);
    }
}
