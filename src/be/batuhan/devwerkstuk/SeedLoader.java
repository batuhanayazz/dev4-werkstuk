package be.batuhan.devwerkstuk;

import be.batuhan.devwerkstuk.factories.PlayerFactory;
import be.batuhan.devwerkstuk.models.Player;
import be.batuhan.devwerkstuk.models.SoccerTeam;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SeedLoader {

    public static final Map<String, String[]> teamsSeed; // Nurdogdu Birincioglu

    static { // Nurdogdu Birincioglu
        teamsSeed = Map.of(
                "Galatasaray", new String[]{"Harun", "Volkan", "Caner", "Pelkas", "Irfancan", "Robben", "James", "Hazard", "Messi", "Mesut", "Cisse"},
                "Fenerbahce", new String[]{"Eray", "Rosier", "Vida", "Ghezzal", "Oguzhan", "Yusuf", "Aboubakar", "Nkodou", "Nani", "Alex", "Ronaldo"},
                "Antwerpen", new String[]{"Ugurcan", "Marcos", "Huseyin", "Doku", "Lukaku", "Ribery", "Sturidge", "Arda", "Emre", "Lemos", "Anelka"},
                "Konyaspor", new String[]{"Courtois", "Depay", "De Vrij", "Destro", "Souza", "Suso", "Hakan", "Cengiz", "Merih", "Axelle", "Jeremy"},
                "Besiktas", new String[]{"Casillas", "Roberto", "Carlos", "Pigue", "Marcelo", "Geremy", "Sandro", "Khazri", "Belhanda", "Melo", "Mbabbe"},
                "Brugge", new String[]{"Dida", "Pirlo", "Ronaldinho", "Pele", "Khabib", "Kalu", "Uche", "Gomez", "Hagi", "Rodri", "Muller"},
                "Anderlecht", new String[]{"Tolga", "Basturk", "Ramiz", "Axelle", "Gotze", "Lewandowski", "Bale", "Kane", "Harry", "Ahmet", "Halil"});
    }

    // Creating SoccerTeam objects
    public static List<SoccerTeam> loadSoccerTeams() {
        List<SoccerTeam> teams = new ArrayList<>();
        for (String teamName : teamsSeed.keySet()) {
            teams.add(new SoccerTeam(teamName));
        }
        return teams;
    }

    // Creating Player object with the PlayerFactory class, Instead of writing loadPlayer methods for different types of Players
    // I used '? extends Player' and casted the returning value in the class itself
    // eg. (List<SoccerPlayer>) SeedLoader.loadPlayers(name, "SOCCER")
    public static List<? extends Player> loadPlayers(String name, String type) {
        PlayerFactory playerFactory  = new PlayerFactory();
        List<Player> playerList = new ArrayList();
        String[] names = teamsSeed.get(name);
        for (int i = 1; i <= names.length; i++) {
            playerList.add(playerFactory.getPlayer(names[i-1], i, type));
        }
        return playerList;
    }
}
