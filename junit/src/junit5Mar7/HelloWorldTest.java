package junit5Mar7;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class HelloWorldTest implements TestLifeCycleLogger {
@Test
@RepeatedTest(4)
void test() {
	System.out.println("first test case");
}
}
