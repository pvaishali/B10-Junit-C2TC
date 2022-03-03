package junit5;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
public class AssumptionDemo1 {
	@Test
	void testOnDev() {
		System.setProperty("EN", "DEV");
		Assumptions.assumeTrue("DEV".equals(System.getProperty("EN")));
	}
	@Test
	void testOnPROD() {
		System.setProperty("EN", "PROD");
		Assumptions.assumingThat("DEV".equals(System.getProperty("EN")),AssumptionDemo1 ::message);
	}
	@Test
	void testOnENV() {
		System.setProperty("EN", "ENV");
		Assumptions.assumeFalse("ENV".equals(System.getProperty("EN")));
	}
	private static String message() {
		return "Today's execution failed::";
}}
