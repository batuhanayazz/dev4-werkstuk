package be.batuhan.devwerkstuk.models;

public class SoccerPlayer extends Player{
    public Integer number;
    public SoccerPlayer(String name, Integer number) {
        this.name = name;
        this.number = number;
    }

    // Implementation of the abstract print() method
    @Override
    public String print() {
        return String.format("Soccerplayer name: %s with number: %s", name, number);
    }
}
