package be.batuhan.devwerkstuk.iterators;

import be.batuhan.devwerkstuk.models.SoccerPlayer;

public interface SoccerPlayerIterator extends Iterable<SoccerPlayer> {
    SoccerPlayer find(Integer number);
}
