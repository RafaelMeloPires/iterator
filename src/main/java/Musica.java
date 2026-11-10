public class Musica {

    private String titulo;
    private int duracaoSegundos;
    private boolean favorita;

    public Musica(String titulo, int duracaoSegundos, boolean favorita) {
        this.titulo = titulo;
        this.duracaoSegundos = duracaoSegundos;
        this.favorita = favorita;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracaoSegundos() {
        return duracaoSegundos;
    }

    public void setDuracaoSegundos(int duracaoSegundos) {
        this.duracaoSegundos = duracaoSegundos;
    }

    public boolean isFavorita() {
        return favorita;
    }

    public void setFavorita(boolean favorita) {
        this.favorita = favorita;
    }
}