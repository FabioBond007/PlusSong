package aplicação;

public class Artista {

    private int id;
    private String nome;
    private String nacionalidade;

    public Artista(int id, String nome, String nacionalidade) {
        this.id = id;
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public String getNacionalidade() { return nacionalidade; }
}

