package rpg_game;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ArqueiroTest {

	Arqueiro arqueiro;
	
	@Before
	public void setUp() throws Exception {
		arqueiro = new Arqueiro();
	}

	@Test
	public void testMago() {
		assertEquals(5, arqueiro.getForca());
		assertEquals(10, arqueiro.getAgilidade());
		assertEquals(2, arqueiro.getInteligencia());
	}

	@Test
	public void testLvlUp() {
		System.out.println(arqueiro.getForca());
		arqueiro.lvlUp();
		System.out.println(arqueiro.getForca());
	}

}
