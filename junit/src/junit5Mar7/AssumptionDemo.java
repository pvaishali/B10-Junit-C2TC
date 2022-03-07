package junit5Mar7;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionDemo {
	@Test
	void testOnDev() {
		System.setProperty("EN", "DEV");
		Assumptions.assumeTrue("DEV".equals(System.getProperty("EN")));
	}
	@Test
	void testOnPROD() {
		System.setProperty("EN", "PROD");
		Assumptions.assumingThat("DEV".equals(System.getProperty("EN")),AssumptionDemo::message);
	}
	private static String message() {
		return "Today's execution failed::";
	}
}
