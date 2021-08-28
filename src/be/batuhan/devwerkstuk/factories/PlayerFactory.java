package be.batuhan.devwerkstuk.factories;

import be.batuhan.devwerkstuk.models.Player;
import be.batuhan.devwerkstuk.models.SoccerPlayer;
import be.batuhan.devwerkstuk.models.TennisPlayer;

public class PlayerFactory {
    // Factory method, returns Player object by type
    public Player getPlayer(String name, Integer number, String type){
        if(type.equalsIgnoreCase("SOCCER")) {
            return new SoccerPlayer(name, number);
        }
        else if(type.equalsIgnoreCase("TENNIS")){
            return new TennisPlayer(name, number);
        }
        // Type doesn't exist, TODO Throw exception?
        return null;
    }
}
