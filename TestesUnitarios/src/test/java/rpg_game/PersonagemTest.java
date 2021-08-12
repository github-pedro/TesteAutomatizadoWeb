package rpg_game;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PersonagemTest {
	
	Personagem personagem;
	Bota bota;
	
	@Before
	public void setUp() throws Exception {
		personagem = new Personagem();
		bota = new Bota();
		personagem.EquiparBota(bota);
	}

	@Test
	public void testGetSetAgilidade() {
		personagem = new Personagem();
		personagem.setAgilidade(12);
		assertEquals(12, personagem.getAgilidade());
	}
	@Test
	public void testGetSetAgilidadeIf() {
		bota.setAgilidade(30);
		personagem.setAgilidade(10);
		assertEquals(40, personagem.getAgilidade());
		bota.setAgilidade(0);
		personagem.setAgilidade(0);
		assertEquals(0, personagem.getAgilidade());
	}

	@Test
	public void testGetSetForca() {
		personagem = new Personagem();
		personagem.setForca(20);
		assertEquals(20, personagem.getForca());
	}
	
	@Test
	public void testGetSetForcaIf() {
		bota.setForca(30);
		personagem.setForca(10);
		assertEquals(40, personagem.getForca());
		bota.setForca(0);
		personagem.setForca(0);
		assertEquals(0, personagem.getForca());
	}

	@Test
	public void testGetSetInteligencia() {
		personagem = new Personagem();
		personagem.setInteligencia(40);
		assertEquals(40, personagem.getInteligencia());
	}
	@Test
	public void testGetSetInteligenciaIf() {
		bota.setInteligencia(30);
		personagem.setInteligencia(10);
		assertEquals(40, personagem.getInteligencia());
		bota.setInteligencia(0);
		personagem.setInteligencia(0);
		assertEquals(0, personagem.getInteligencia());
	}
	@Test
	public void testGetSetHpIf() {
		personagem.setForca(30);
		bota.setForca(30);
		assertEquals(6000, personagem.getHp());
	}
	
	@Test
	public void testGetSetHpElse() {
		personagem = new Personagem();
		personagem.setForca(30);
		assertEquals(3000, personagem.getHp());
	}
	
	@Test
	public void testGetSetMana() {
		personagem = new Personagem();
		personagem.setInteligencia(30);
		assertEquals(3000, personagem.getMana());
	}

	@Test
	public void testGetSetManaIf() {
		personagem.setInteligencia(30);
		bota.setInteligencia(30);
		assertEquals(6000, personagem.getMana());
	}

	@Test
	public void testGetSetLevel() {
		personagem.setLevel(53);
		assertEquals(53, personagem.getLevel());
	}


	@Test
	public void testEquiparBota() {
		personagem.EquiparBota(bota);
	}

	@Test
	public void testExibirDadosInicialJogador() {
		personagem.exibirDadosInicialJogador();
	}

	@Test
	public void testExibirNovosDadosJogador() {
		personagem.exibirNovosDadosJogador();
	}

}
