package rpg_game;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class BotaTest {

	Bota bota;
	
	@Before
	public void setUp() throws Exception {
		bota = new Bota();
	}
	
	@Test
	public void testGetSetForca() {
		bota.setForca(10);
		assertEquals(10, bota.getForca());
	}

	@Test
	public void testGetSetAgilidade() {
		bota.setAgilidade(30);
		assertEquals(30, bota.getAgilidade());
	}

	@Test
	public void testGetSetInteligencia() {
		bota.setInteligencia(50);
		assertEquals(50, bota.getInteligencia());
	}

	@Test
	public void testGetSetNomeBota() {
		bota.setNomeBota("Bota Diamante");
		assertEquals("Bota Diamante", bota.getNomeBota());
	}



}
