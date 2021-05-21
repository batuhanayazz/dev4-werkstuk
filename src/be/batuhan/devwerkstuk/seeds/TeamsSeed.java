package be.batuhan.devwerkstuk.seeds;

import java.util.Map;

public class TeamsSeed {
    public static final Map<String, String[]> teamsSeed;

    static {
        teamsSeed = Map.of(
                "Galatasaray", new String[]{"1", "Nurdogdu", "Furkan", "Ahmet", "Tomas", "Rob", "Miranda", "Jonas", "Muslera", "Fatih", "1"},
                "Fenerbahce", new String[]{"2", "Nurdogdu", "Furkan", "Ahmet", "Tomas", "Rob", "Miranda", "Jonas", "Muslera", "Fatih", "2"},
                "Antwerpen", new String[]{"3", "Nurdogdu", "Furkan", "Ahmet", "Tomas", "Rob", "Miranda", "Jonas", "Muslera", "Fatih", "3"},
                "Konyaspor", new String[]{"3", "Nurdogdu", "Furkan", "Ahmet", "Tomas", "Rob", "Miranda", "Jonas", "Muslera", "Fatih", "3"},
                "Besiktas", new String[]{"3", "Nurdogdu", "Furkan", "Ahmet", "Tomas", "Rob", "Miranda", "Jonas", "Muslera", "Fatih", "3"},
                "Brugge", new String[]{"3", "Nurdogdu", "Furkan", "Ahmet", "Tomas", "Rob", "Miranda", "Jonas", "Muslera", "Fatih", "3"},
                "Anderlecht", new String[]{"4", "Nurdogdu", "Furkan", "Ahmet", "Tomas", "Rob", "Miranda", "Jonas", "Muslera", "Fatih", "4"});
    }
}
