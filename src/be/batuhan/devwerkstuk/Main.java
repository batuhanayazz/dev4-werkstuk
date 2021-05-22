package be.batuhan.devwerkstuk;

import be.batuhan.devwerkstuk.models.SoccerPlayer;
import be.batuhan.devwerkstuk.models.SoccerTeam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Optional;

public class Main {

    static SoccerCompetition competition;
    static BufferedReader reader;

    public static void main(String[] args) {
        reader = new BufferedReader(new InputStreamReader(System.in));
        competition = SoccerCompetition.getInstance();

        _printHeader();

        try {
            String menuItem = _printMenu();
            while (!menuItem.equals("0")) {
                doMenAction(menuItem);
                menuItem = _printMenu();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void _printHeader() {
        System.out.println("***************************");
        System.out.println("WELCOME TO FOOTBALL");
        System.out.println("***************************");
    }

    private static String _printMenu() throws IOException {
        System.out.println("1) Print all teams");
        System.out.println("2) Print all players");
        System.out.println("3) Print all players by team");
        System.out.println("4) Find player by number");
        System.out.println("5) Simulate games");
        System.out.println("0) Exit");
        return reader.readLine();
    }

    private static void doMenAction(String menuItem) throws IOException {
        switch (menuItem) {
            case "1":
                System.out.println("********** ALL TEAMS **********");
                competition.soccerTeams.forEach(t -> System.out.println(t.getName()));
                System.out.println("*******************************");
                break;
            case "2":
                System.out.println("********** ALL PLAYERS **********");
                competition.soccerTeams.forEach(t -> t.getSoccerPlayerList().forEach(ps -> System.out.println(ps.getName())));
                System.out.println("*******************************");
                break;
            case "3":
                System.out.println("********** ALL TEAMS **********");
                competition.soccerTeams.forEach(t -> System.out.println(t.getName()));
                System.out.println("*******************************");
                System.out.println("Enter a team name");
                String teamName = reader.readLine();
                Optional<SoccerTeam> team = competition.soccerTeams.stream().filter(t -> t.getName().equals(teamName)).findFirst();
                if (team.isPresent()) {
                    System.out.println("********** PLAYERS **********");
                    team.get().forEach(p -> System.out.println(p.getName()));
                    System.out.println("*******************************");
                } else {
                    System.out.println("Team not found");
                }
                break;
            case "4":
                System.out.println("Enter a number");
                String number = reader.readLine();
                for (SoccerTeam t : competition.soccerTeams) {
                    SoccerPlayer p = t.find(Integer.parseInt(number));
                    if (p != null) {
                        System.out.format("%s => %s %d \n\n", t.getName(), p.getName(), p.getNumber());
                    }
                }
                break;
            case "5":
                competition.simulateGames();
                break;
            case "0":
                System.exit(0);
            default:
                System.out.println("Wrong menu item, try again");
                break;
        }
    }
}
