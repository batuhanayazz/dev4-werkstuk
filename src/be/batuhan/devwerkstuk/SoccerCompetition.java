package be.batuhan.devwerkstuk;

import be.batuhan.devwerkstuk.factories.SoccerTeamFactory;
import be.batuhan.devwerkstuk.models.SoccerTeam;
import be.batuhan.devwerkstuk.seeds.TeamsSeed;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class SoccerCompetition {

    private static SoccerCompetition soccerCompetition;
    public List<SoccerTeam> soccerTeams;

    public static SoccerCompetition getInstance() //factory method
    {
        if (soccerCompetition == null) {
            soccerCompetition = new SoccerCompetition();
            _loadTeams();
        }
        return soccerCompetition;
    }

    private static void _loadTeams() {
        soccerCompetition.soccerTeams = new ArrayList<>();
        for (String teamName : TeamsSeed.teamsSeed.keySet()) {
            soccerCompetition.soccerTeams.add(SoccerTeamFactory.getSoccerTeam(teamName));
        }
    }

    public void simulateGames() {
        Random random = new Random();
        int countGames = soccerTeams.size() / 2;
        int i = 0;
        do {
            int t1 = random.nextInt(5);
            int t2 = random.nextInt(5);

            SoccerTeam tn1 = soccerTeams.get(i);
            SoccerTeam tn2 = soccerTeams.get(i + 1);

            System.out.printf("%s %s - %s %s \n\n", tn1.getName(), t1, tn2.getName(), t2);

            i += 2;
            countGames--;
        } while (countGames != 0);

        System.out.printf("%s didn't play \n\n", soccerTeams.get(soccerTeams.size() - 1).getName());
    }
}
