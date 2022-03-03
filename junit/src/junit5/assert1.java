package junit5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class assert1 {
	@Test
	public void whenAssertingEquality_thenEqual() {
	    float square = 3 * 3;
	    float rectangle = 2 * 2;

	    assertEquals(square, rectangle);
	}
	@Test
	public void whenAssertingConditions_thenVerified() {
	    assertTrue(8 > 4, "8 is greater the 4");
	    assertTrue(null == null, "null is equal to null");
	}
	@Test
	public void whenAssertingNotNull_thenTrue() {
	    Object flower = new Object();

	    assertNotNull(flower, () -> "The flower should not be null");
	}
}
