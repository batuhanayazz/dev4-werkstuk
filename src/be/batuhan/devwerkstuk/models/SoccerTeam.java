package be.batuhan.devwerkstuk.models;

import be.batuhan.devwerkstuk.SeedLoader;
import be.batuhan.devwerkstuk.iterators.SoccerPlayerIterator;

import java.util.Iterator;
import java.util.List;

public class SoccerTeam extends Team implements SoccerPlayerIterator  {
    public List<SoccerPlayer> soccerPlayerList;

    public SoccerTeam(String name) {
        this.name = name;
        this.soccerPlayerList = _loadPlayers();
    }

    // Load players with SeedLoader class, this method will use the PlayerFactory, that's why we pass the type "SOCCER"
    private List<SoccerPlayer> _loadPlayers() {
        // Cast the object to SoccerPlayer
        return (List<SoccerPlayer>) SeedLoader.loadPlayers(name, "SOCCER");
    }

    @Override
    public Iterator<SoccerPlayer> iterator() {
        return soccerPlayerList.iterator();
    }

    // Iterator find implementation, returns null value if it doesn't exist
    @Override
    public SoccerPlayer find(Integer number) {
        // Instead of looping trough the list with a 'for', I used .stream() with a filter 'number == player.number'
        // and then .findFirst(), if we can't find one return null .orElse(null)
        return soccerPlayerList.stream().filter(player -> number.equals(player.number))
                .findFirst()
                .orElse(null);
    }
}
