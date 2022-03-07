package junit5Mar7;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class DisabedClassDemo {
	@Test
	void test1() {
		System.out.println("hi not disabled");
		
	}
	@Disabled
	@Test
	void test() {
		System.out.println("hi disabled");
		
	}
}
