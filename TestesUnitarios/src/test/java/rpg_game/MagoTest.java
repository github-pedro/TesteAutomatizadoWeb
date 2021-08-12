package rpg_game;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MagoTest {
	Mago mago;
	@Before
	public void setUp() throws Exception {
		mago = new Mago();
	}

	@Test
	public void testMago() {
		assertEquals(2, mago.getForca());
		assertEquals(5, mago.getAgilidade());
		assertEquals(10, mago.getInteligencia());
	}

	@Test
	public void testLvlUp() {
		System.out.println(mago.getForca());
		mago.lvlUp();
		System.out.println(mago.getForca());
	}

}
