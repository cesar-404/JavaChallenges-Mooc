import java.util.ArrayList;
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        int counter = 0;
        
        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        try(Scanner getFile = new Scanner(Paths.get(file))) {
            while(getFile.hasNextLine()) {
                list.add(getFile.nextLine());
            }
            
            for(int i = 0; i < list.size(); i++) {
                if(Integer.parseInt(list.get(i)) >= lowerBound &&
                        Integer.parseInt(list.get(i)) <= upperBound) {
                    counter++;
                }
            }
            System.out.println("Numbers: "+counter);
            
            
        } catch (Exception e) {
            
        }
        
    }

}
