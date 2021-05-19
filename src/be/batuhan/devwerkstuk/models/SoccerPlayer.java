package be.batuhan.devwerkstuk.models;

public class SoccerPlayer {
    private String name;
    private Integer number;

    private SoccerPlayer(String name, Integer number) {
        this.name = name;
        this.number = number;
    }

    public static SoccerPlayer getSoccerPlayer(String name, Integer number) {
        return new SoccerPlayer(name, number);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return String.format("Name: %s with number: %s", name, number);
    }
}
