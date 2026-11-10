import java.util.Iterator;

public class Estatistica {

    public static Integer contarMusicasFavoritas(Playlist playlist) {
        int quantidade = 0;
        for (Musica musica : playlist) {
            if (musica.isFavorita()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalMusicas(Playlist playlist) {
        int quantidade = 0;
        for (Iterator<Musica> m = playlist.iterator(); m.hasNext(); ) {
            quantidade++;
            m.next();
        }
        return quantidade;
    }

    public static Integer calcularDuracaoTotal(Playlist playlist) {
        int total = 0;
        for (Musica musica : playlist) {
            total += musica.getDuracaoSegundos();
        }
        return total;
    }

}