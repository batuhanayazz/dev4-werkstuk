package be.batuhan.devwerkstuk.iterators;

import be.batuhan.devwerkstuk.models.SoccerPlayer;

// Iterator class
public interface SoccerPlayerIterator extends Iterable<SoccerPlayer> {
    // Find method to easily find players by their number
    SoccerPlayer find(Integer number);
}
