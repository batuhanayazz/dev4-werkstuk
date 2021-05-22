package be.batuhan.devwerkstuk.seeds;

import java.util.Map;

public class TeamsSeed {
    public static final Map<String, String[]> teamsSeed;

    static {
        teamsSeed = Map.of(
                "Galatasaray", new String[]{"Harun", "Volkan", "Caner", "Pelkas", "Irfancan", "Robben", "James", "Hazard", "Messi", "Mesut", "Cisse"},
                "Fenerbahce", new String[]{"Eray", "Rosier", "Vida", "Ghezzal", "Oguzhan", "Yusuf", "Aboubakar", "Nkodou", "Nani", "Alex", "Ronaldo"},
                "Antwerpen", new String[]{"Ugurcan", "Marcos", "Huseyin", "Doku", "Lukaku", "Ribery", "Sturidge", "Arda", "Emre", "Lemos", "Anelka"},
                "Konyaspor", new String[]{"Courtois", "Depay", "De Vrij", "Destro", "Souza", "Suso", "Hakan", "Cengiz", "Merih", "Axelle", "Jeremy"},
                "Besiktas", new String[]{"Casillas", "Roberto", "Carlos", "Pigue", "Marcelo", "Geremy", "Sandro", "Khazri", "Belhanda", "Melo", "Mbabbe"},
                "Brugge", new String[]{"Dida", "Pirlo", "Ronaldinho", "Pele", "Khabib", "Kalu", "Uche", "Gomez", "Hagi", "Rodri", "Muller"},
                "Anderlecht", new String[]{"Tolga", "Basturk", "Ramiz", "Axelle", "Gotze", "Lewandowski", "Bale", "Kane", "Harry", "Ahmet", "Halil"});
    }
}
