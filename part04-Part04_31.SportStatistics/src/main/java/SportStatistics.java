
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File: ");
        String file = scan.nextLine();

        ArrayList<String> list = new ArrayList<>();
        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                list.add(line);
                if (line.isEmpty()) {
                    continue;
                }
            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
        System.out.println("Team: ");
        String team = scan.nextLine();

        int count = 0;
        int wins = 0;
        int losses = 0;

        for (String list1 : list) {
            String[] parts = list1.split(",");
            //Splits the values by comma
            String team1 = parts[0];
            //Sets the first team as team 1
            String team2 = parts[1];
            //Sets the second team as team 2
            int team1Points = Integer.valueOf(parts[2]);
            // sets points of team 1 as team1Points
            int team2Points = Integer.valueOf(parts[3]);
            //Sets points of team 2 as team2Points
            
            if ((team.equals(team1) || (team.equals(team2)))) {
                count = count + 1;
            }
            //if team is equal to team1 or team2, count will add one
            if (team.equals(team2) && (team2Points > team1Points)) {
                wins = wins + 1;
            }
            if (team.equals(team2) && (team2Points < team1Points)) {
                losses = losses + 1;
            }
            if (team.equals(team1) && (team1Points > team2Points)) {
                wins = wins + 1;
            }
            if (team.equals(team1) && (team1Points < team2Points)) {
                losses = losses + 1;
            }
            
            
        }
        System.out.println("Games: " + count);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);

    }

}
