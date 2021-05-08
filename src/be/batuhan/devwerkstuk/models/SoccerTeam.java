package be.batuhan.devwerkstuk.models;

import be.batuhan.devwerkstuk.iterators.SoccerPlayerIterator;
import be.batuhan.devwerkstuk.seeds.PlayerSeeds;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SoccerTeam implements SoccerPlayerIterator {
    private String name;
    private List<SoccerPlayer> soccerPlayerList;

    public SoccerTeam(String name) {
        this.name = name;
        this.soccerPlayerList = new ArrayList<>();
        loadPlayers();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SoccerPlayer> getSoccerPlayerList() {
        return soccerPlayerList;
    }

    public void setSoccerPlayerList(List<SoccerPlayer> soccerPlayerList) {
        this.soccerPlayerList = soccerPlayerList;
    }

    private void loadPlayers() {
        int i = 0;
        for (String name : PlayerSeeds.names) {
            soccerPlayerList.add(SoccerPlayer.getPlayer(name, PlayerSeeds.numbers[i]));
            i++;
        }
    }

    @Override
    public Iterator<SoccerPlayer> iterator() {
        return soccerPlayerList.iterator();
    }

    @Override
    public SoccerPlayer find(Integer number) {
        //If returns null == doesn't exist
        return soccerPlayerList.stream().filter(player -> number.equals(player.getNumber()))
                .findFirst()
                .orElse(null);
    }
}