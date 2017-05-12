import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {

	@Test
	public void test_executeCommand() {
		
		PlanetExplorer planet = new PlanetExplorer(100,100, "(0,1)");
		
		String expected = "(0,0,N)(0,1)";
		
		assertEquals(expected, planet.executeCommand("f"));
	}
}
