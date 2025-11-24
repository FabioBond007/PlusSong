package aplicação;

public class Musica {

    private int id;
    private String titulo;
    private Artista artista;
    private String album;
    private int ano;

    public Musica(int id, String titulo, Artista artista, String album, int ano) {
        this.id = id;
        this.titulo = titulo;
        this.artista = artista;
        this.album = album;
        this.ano = ano;
    }

    public String getTitulo() { return titulo; }
    public Artista getArtista() { return artista; }
}
