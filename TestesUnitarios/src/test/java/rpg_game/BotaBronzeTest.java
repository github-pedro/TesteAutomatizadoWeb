package rpg_game;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BotaBronzeTest {

	BotaBronze botaBronze;
	
	@Before
	public void setUp() throws Exception {
		 botaBronze = new BotaBronze();
	}

	@Test
	public void testBotaBronze() {
		assertEquals(1, botaBronze.getForca());
		assertEquals("Bota bronze", botaBronze.getNomeBota());
	}

}
