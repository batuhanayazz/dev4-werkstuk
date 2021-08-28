package be.batuhan.devwerkstuk;

import be.batuhan.devwerkstuk.models.SoccerTeam;
import java.util.List;


public class SoccerCompetition {

    // Singleton class
    private static SoccerCompetition soccerCompetition;

    public List<SoccerTeam> soccerTeams;

    // Constructor is private, so we can't create an instance
    private SoccerCompetition(List<SoccerTeam> soccerTeams){
        this.soccerTeams = soccerTeams;
    }

    // You can only create an instance through this method, and only one instance can be created
    public static SoccerCompetition getInstance()
    {
        if (soccerCompetition == null) {
            soccerCompetition = new SoccerCompetition(_loadTeams());
        }
        return soccerCompetition;
    }

    private static List<SoccerTeam> _loadTeams() {
        return SeedLoader.loadSoccerTeams();
    }
}
