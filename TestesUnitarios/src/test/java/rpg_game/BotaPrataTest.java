package rpg_game;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BotaPrataTest {
	BotaPrata botaPrata;

	@Before
	public void setUp() throws Exception {
		botaPrata = new BotaPrata();
	}

	@Test
	public void testBotaPrata(){
		assertEquals(2, botaPrata.getForca());
		assertEquals(1, botaPrata.getAgilidade());
		assertEquals(1, botaPrata.getInteligencia());
		assertEquals("Bota prata", botaPrata.getNomeBota());
	}

}
