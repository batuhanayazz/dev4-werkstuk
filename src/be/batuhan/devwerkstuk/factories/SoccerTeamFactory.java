package be.batuhan.devwerkstuk.factories;

import be.batuhan.devwerkstuk.models.SoccerTeam;

public class SoccerTeamFactory {
    public static SoccerTeam getSoccerTeam(String name) {
        return new SoccerTeam(name);
    }
}
