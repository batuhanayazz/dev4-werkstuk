package be.batuhan.devwerkstuk;

import be.batuhan.devwerkstuk.models.SoccerTeam;

import java.util.List;
import java.util.Random;

// Game simulator class, to keep the game code separate from the other code.
public class GameSimulator {

    // Simulates competition, calls simulateGame()
    void simulateCompetition(List<SoccerTeam> soccerTeams){
        int countGames = soccerTeams.size() / 2;
        int i = 0;
        do {
            SoccerTeam tn1 = soccerTeams.get(i);
            SoccerTeam tn2 = soccerTeams.get(i + 1);
            simulateGame(tn1, tn2);
            i += 2;
            countGames--;
        } while (countGames != 0);
        System.out.printf("%s didn't play \n\n", soccerTeams.get(soccerTeams.size() - 1).name);
    }

    // Calculates goals with Random class
    void simulateGame(SoccerTeam team1, SoccerTeam team2){
        Random random = new Random();
        int team1Goals = random.nextInt(5);
        int team2Goals = random.nextInt(5);
        System.out.printf("%s %s - %s %s \n\n", team1.name, team1Goals, team2.name, team2Goals);
    }
}
