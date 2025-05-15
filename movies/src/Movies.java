import java.util.HashMap;

public class Movies {

    //HashMap object called film
    private final HashMap<String, String> film = new HashMap<>();

    protected Movies() {
        film.put("Mission Impossible", "Ethan Hunt");
        film.put("Taken", "Bryan Mills");
        film.put("The Bourne Identity", "Jason Bourne");
        film.put("Dr. No", "James Bond");
        film.put("The Equalizer", "Robert McCall");
        film.put("John Wick", "John Wick");
        film.put("Die Hard", "John McClane");
        film.put("Blade", "Eric Brooks");
    }

    public HashMap<String, String> getFilm() {

        return film;
    }
}
