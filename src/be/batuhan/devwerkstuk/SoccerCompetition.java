package be.batuhan.devwerkstuk;

import be.batuhan.devwerkstuk.factories.SoccerTeamFactory;
import be.batuhan.devwerkstuk.models.SoccerTeam;
import be.batuhan.devwerkstuk.seeds.TeamsSeed;

import java.util.ArrayList;
import java.util.List;


public class SoccerCompetition {

    private static SoccerCompetition soccerCompetition;
    private List<SoccerTeam> soccerTeams;

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

    public void playGames() {
        for (SoccerTeam team : soccerTeams) {
            System.out.println(team.getName());
            team.getSoccerPlayerList().forEach(
                    p -> System.out.println(p.getName())
            );

            System.out.println("Number 10 =>" + team.find(10));
        }
    }
}
