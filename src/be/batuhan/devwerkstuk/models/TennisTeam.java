package be.batuhan.devwerkstuk.models;

import be.batuhan.devwerkstuk.SeedLoader;
import java.util.List;

public class TennisTeam extends Team {
    public List<TennisPlayer> tennisPlayerList;

    public TennisTeam(String name) {
        this.name = name;
        this.tennisPlayerList = _loadPlayers();
    }

    // Same as SoccerTeam, but for TennisPlayers
    private List<TennisPlayer> _loadPlayers() {
      return (List<TennisPlayer>) SeedLoader.loadPlayers(name, "TENNIS");
    }
}
