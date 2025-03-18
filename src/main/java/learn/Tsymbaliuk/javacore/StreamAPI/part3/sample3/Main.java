package learn.Tsymbaliuk.javacore.StreamAPI.part3.sample3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Singer singer1 = new Singer("Freddie Mercury", new String[] { "We are Champions", "Somebody to love" });
        Singer singer2 = new Singer("David Bowie",
                new String[] { "Space Oddity", "Let me sleep beside you", "Suffragette city" });
        Singer singer3 = new Singer("James Paul McCertney", new String[] { "Can't buy me love", "Another girl"});

        Singer[] rockStars = new Singer[] { singer1, singer2, singer3 };

        List<String> song = Arrays.stream(rockStars)
                .flatMap(n -> Arrays.stream(n.getSongs()))
                .collect(Collectors.toList());

        System.out.println(song);
    }
}

class Singer {
    private String name;
    private String[] songs;

    public Singer(String name, String[] songs) {
        super();
        this.name = name;
        this.songs = songs;
    }

    public String getName() {
        return name;
    }

    public String[] getSongs() {
        return songs;
    }

    @Override
    public String toString() {
        return "Singer [name = " + name + ", songs = " + Arrays.toString(songs) + "]";
    }
}

