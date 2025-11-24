package aplicação;

import java.util.ArrayList;
import java.util.List;

public class MusicaServiceMock {

    private List<Musica> bancoDeMusicas = new ArrayList<>();

    public MusicaServiceMock() {

        // ===== Artistas =====
        Artista johnLennon = new Artista(1, "John Lennon", "Reino Unido");
        Artista michaelJackson = new Artista(2, "Michael Jackson", "EUA");
        Artista nirvana = new Artista(3, "Nirvana", "EUA");

        // ===== John Lennon (5 músicas) =====
        bancoDeMusicas.add(new Musica(1, "Imagine", johnLennon, "Imagine", 1971));
        bancoDeMusicas.add(new Musica(2, "Jealous Guy", johnLennon, "Imagine", 1971));
        bancoDeMusicas.add(new Musica(3, "Instant Karma", johnLennon, "Single", 1970));
        bancoDeMusicas.add(new Musica(4, "Love", johnLennon, "John Lennon/Plastic Ono Band", 1970));
        bancoDeMusicas.add(new Musica(5, "Woman", johnLennon, "Double Fantasy", 1980));

        // ===== Michael Jackson (5 músicas) =====
        bancoDeMusicas.add(new Musica(6, "Billie Jean", michaelJackson, "Thriller", 1982));
        bancoDeMusicas.add(new Musica(7, "Beat It", michaelJackson, "Thriller", 1982));
        bancoDeMusicas.add(new Musica(8, "Thriller", michaelJackson, "Thriller", 1982));
        bancoDeMusicas.add(new Musica(9, "Smooth Criminal", michaelJackson, "Bad", 1987));
        bancoDeMusicas.add(new Musica(10, "Black or White", michaelJackson, "Dangerous", 1991));

        // ===== Nirvana (5 músicas) =====
        bancoDeMusicas.add(new Musica(11, "Smells Like Teen Spirit", nirvana, "Nevermind", 1991));
        bancoDeMusicas.add(new Musica(12, "Come As You Are", nirvana, "Nevermind", 1991));
        bancoDeMusicas.add(new Musica(13, "Lithium", nirvana, "Nevermind", 1991));
        bancoDeMusicas.add(new Musica(14, "Heart-Shaped Box", nirvana, "In Utero", 1993));
        bancoDeMusicas.add(new Musica(15, "All Apologies", nirvana, "In Utero", 1993));
    }

    // ===== BUSCA SOMENTE PELO ARTISTA =====
    public List<Musica> buscar(String nomeArtista) {
        List<Musica> resultado = new ArrayList<>();

        for (Musica m : bancoDeMusicas) {
            if (m.getArtista().getNome().toLowerCase()
                    .contains(nomeArtista.toLowerCase())) {
                resultado.add(m);
            }
        }

        return resultado;
    }
}
