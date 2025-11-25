package teste;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.Test;

import aplicação.Musica;
import aplicação.MusicaServiceMock;

public class MusicaServiceMockTest {

	@Test
	public void deveRetornar5MusicasDoJohnLennon() {
		MusicaServiceMock service = new MusicaServiceMock();

		List<Musica> resultado = service.buscar("John Lennon");

		assertEquals(5, resultado.size());
		resultado.forEach(m -> assertEquals("John Lennon", m.getArtista().getNome()));
	}

	@Test
	public void deveRetornar5MusicasDoMichaelJackson() {
		MusicaServiceMock service = new MusicaServiceMock();

		List<Musica> resultado = service.buscar("Michael Jackson");

		assertEquals(5, resultado.size());
		resultado.forEach(m -> assertEquals("Michael Jackson", m.getArtista().getNome()));
	}

	@Test
	public void deveRetornar5MusicasDoNirvana() {
		MusicaServiceMock service = new MusicaServiceMock();

		List<Musica> resultado = service.buscar("Nirvana");

		assertEquals(5, resultado.size());
		resultado.forEach(m -> assertEquals("Nirvana", m.getArtista().getNome()));
	}

	@Test
	public void deveBuscarIgnorandoMaiusculasMinusculas() {
		MusicaServiceMock service = new MusicaServiceMock();

		List<Musica> resultado = service.buscar("mIcHaEl jAcKsOn");

		assertEquals(5, resultado.size());
	}

	@Test
	public void deveRetornarListaVaziaParaArtistaInexistente() {
		MusicaServiceMock service = new MusicaServiceMock();

		List<Musica> resultado = service.buscar("Artista Que Não Existe");

		assertTrue(resultado.isEmpty());
	}
	
	@Test
	public void deveRetornarErro() {
		MusicaServiceMock service = new MusicaServiceMock();

		List<Musica> resultado = service.buscar("Nirvana");

		assertEquals(5, resultado.size());
		resultado.forEach(m -> assertEquals("Nirvana", m.getArtista().getNome()));
	}

}
