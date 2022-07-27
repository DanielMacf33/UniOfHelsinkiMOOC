
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        System.out.println("File: ");
        String file = scan.nextLine();
        System.out.println("Team: ");
        String team = scan.nextLine();
        
        int count = 0;
        
        try (Scanner sc = new Scanner(Paths.get(file))) {

    while (sc.hasNextLine()) {
        String line = sc.nextLine();

        String[] parts = line.split(",");
        String homeTeam = parts[0];
        String awayTeam = parts[1];
        int homeScore = Integer.valueOf(parts[2]);
        int awayScore = Integer.valueOf(parts[3]);
        
        if(homeTeam.equals(team)){
            count++;
        }else if(awayTeam.equals(team)){
            count++;
        }
        
    }
        }catch (Exception e) {
            System.out.println("error " + e.getMessage());
        }
        
        System.out.println("Games: " + count);
        
        

    }

}
