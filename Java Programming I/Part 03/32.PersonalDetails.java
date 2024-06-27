
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int oldest = 0;
        String name = "";
        int counter = 0;
        int average = 0;
        
        while(true) {
            String input = scanner.nextLine();
            String[] text = input.split(",");
            
            if(input.equals("")) {
                break;
            }
            
            int age = Integer.parseInt(text[1]);
            String longestName = text[0];
            if(name.length() < longestName.length()) {
                name = longestName;
            }
            
            average += age;
            counter++;
        }
        
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + 1.0 * average / counter );

    }
}
