import java.util.ArrayList;
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> row = new ArrayList<>();
        
        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
        try(Scanner getFile = new Scanner(Paths.get(file))) {
            while(getFile.hasNextLine()) {
                row.add(getFile.nextLine());
            }
            boolean found = false;
            for (int i = 0; i < row.size(); i++) {
                if(searchedFor.equals(row.get(i))) {
                    found = true;
                    break;
                } 
            }
            
            if(found) {
                System.out.println("Found!");
            } else {
                System.out.println("Not found.");
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
        
    }
}
