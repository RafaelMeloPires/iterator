import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Playlist implements Iterable<Musica> {

    private List<Musica> musicas = new ArrayList<Musica>();

    public Playlist(Musica... musicas) {
        this.musicas = Arrays.asList(musicas);
    }

    @Override
    public Iterator<Musica> iterator() {
        return musicas.iterator();
    }

}