import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {

	@Test
	public void test_executeCommand() {
		
		PlanetExplorer planet = new PlanetExplorer(100,100, null);
		
		String expected = "(0,1,N)";
		
		assertEquals(expected, planet.executeCommand("f"));
	}
}
