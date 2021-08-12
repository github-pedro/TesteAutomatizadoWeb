package rpg_game;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GuerreiroTest {

	Guerreiro guerreiro;
	
	@Before
	public void setUp() throws Exception {
		guerreiro = new Guerreiro();
	}

	@Test
	public void testMago() {
		assertEquals(10, guerreiro.getForca());
		assertEquals(5, guerreiro.getAgilidade());
		assertEquals(2, guerreiro.getInteligencia());
	}

	@Test
	public void testLvlUp() {
		guerreiro.lvlUp();
	}

}
