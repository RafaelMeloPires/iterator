import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EstatisticaTest {

    @Test
    void deveContarMusicasFavoritas() {
        Musica musica1 = new Musica("Música 1", 200, true);
        Musica musica2 = new Musica("Música 2", 180, false);
        Musica musica3 = new Musica("Música 3", 240, true);
        Playlist playlist = new Playlist(musica1, musica2, musica3);

        assertEquals(2, Estatistica.contarMusicasFavoritas(playlist));
    }

    @Test
    void deveContarTotalMusicas() {
        Musica musica1 = new Musica("Música 1", 200, true);
        Musica musica2 = new Musica("Música 2", 180, false);
        Musica musica3 = new Musica("Música 3", 240, true);
        Playlist playlist = new Playlist(musica1, musica2, musica3);

        assertEquals(3, Estatistica.contarTotalMusicas(playlist));
    }

    @Test
    void deveCalcularDuracaoTotal() {
        Musica musica1 = new Musica("Música 1", 200, true);
        Musica musica2 = new Musica("Música 2", 180, false);
        Musica musica3 = new Musica("Música 3", 240, true);
        Playlist playlist = new Playlist(musica1, musica2, musica3);

        assertEquals(620, Estatistica.calcularDuracaoTotal(playlist));
    }

    @Test
    void deveRetornarZeroParaPlaylistVazia() {
        Playlist playlist = new Playlist();

        assertEquals(0, Estatistica.contarTotalMusicas(playlist));
        assertEquals(0, Estatistica.contarMusicasFavoritas(playlist));
    }

}