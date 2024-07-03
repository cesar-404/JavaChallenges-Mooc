
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        
        try(Scanner getFile = new Scanner(Paths.get(file))) {
            while(getFile.hasNextLine()) {
                String[] parts = getFile.nextLine().split(",");
                int age = Integer.parseInt(parts[1]);
                if(age != 1) {
                    System.out.println(parts[0]+ ", age: "+age+" years");
                } else {
                    System.out.println(parts[0]+ ", age: "+age+" year");
                }
            }
         
        } 
        catch (Exception e) {
            System.out.println("Error: "+e);
        }
    }
}
