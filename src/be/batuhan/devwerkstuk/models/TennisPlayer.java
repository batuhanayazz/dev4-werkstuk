package be.batuhan.devwerkstuk.models;

public class TennisPlayer extends Player{
    public TennisPlayer(String name, Integer number){
        this.name = name;
    }

    // Implementation of the abstract print() method
    @Override
    public String print() {
        return String.format("TennisPlayer name: %s", name);
    }
}
