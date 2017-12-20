package br.com.cactus.cactusmoney.api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.cactus.cactusmoney.api.model.Categoria;
import br.com.cactus.cactusmoney.api.repository.CategoriaRepository;

@RunWith(SpringJUnit4ClassRunner.class)
public class CategoriaResourceTest {

	@Mock
	private CategoriaRepository categoriaRepository;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void listarTeste() {
		List<Categoria> categorias = new ArrayList<>();
		Categoria categoria = new Categoria();
		categoria.setCodigo(1L);
		categoria.setNome("Categoria 1");
		categorias.add(categoria);

		Mockito.when(categoriaRepository.findAll()).thenReturn(categorias);

		List<Categoria> result = categoriaRepository.findAll();

		assertNotNull(result);
	}

	@Test
	public void buscarPeloCodigoTeste() {
		Categoria categoria = new Categoria();
		categoria.setCodigo(1L);
		categoria.setNome("Teste Categoria");

		Mockito.when(categoriaRepository.findOne(1L)).thenReturn(categoria);

		Categoria result = categoriaRepository.findOne(1L);

		assertEquals("Teste Categoria", result.getNome());

		assertEquals(new Long(2), result.getCodigo());

		assertEquals(new Long(2), result.getCodigo());
	}

}
