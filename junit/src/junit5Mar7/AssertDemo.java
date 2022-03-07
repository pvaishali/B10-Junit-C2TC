package junit5Mar7;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class AssertDemo {
	@Test
	public void display() {
		int A=1;
		int B=1;
		assertEquals(A,B);
	}
	@Test
public void display1() {
		int A=1;
		int B=2;
		assertEquals(A,B);
	}
@Disabled
	@Test
	public void display2() {
		int A=1;
		int B=3;
		assertEquals(A,B);
	}
}

