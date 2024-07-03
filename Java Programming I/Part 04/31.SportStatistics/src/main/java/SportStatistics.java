
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("File:");
        String file = scanner.nextLine();
        System.out.println("Team:");
        String searchedTeam = scanner.nextLine();
        
        int games = 0;
        int wins = 0;
        int losses = 0;
        
        
        try(Scanner getFile = new Scanner(Paths.get(file))) {
            while(getFile.hasNextLine()) {
                String line = getFile.nextLine();
                String[] data = line.split(",");
                String home = data[0];
                String away = data[1];
                int homeScore = Integer.parseInt(data[2]);
                int awayScore = Integer.parseInt(data[3]);
                
                if(searchedTeam.equals(home)) {
                    games++;
                    if(homeScore > awayScore) {
                        wins++;
                    } else {
                        losses++;
                    }
                } else if(searchedTeam.equals(away)) {
                    games++;
                    if(awayScore > homeScore) {
                        wins++;
                    } else {
                        losses++;
                    }
                } else {
                    System.out.println("Get in the fucking robot, Shinji!");;
                }
            }
            System.out.println("Games: "+games);
            System.out.println("Wins: "+wins);
            System.out.println("Losses: "+losses);
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
        
        
    }

}
