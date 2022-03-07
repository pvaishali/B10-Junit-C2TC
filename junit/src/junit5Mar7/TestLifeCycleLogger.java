

package junit5Mar7;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
@TestInstance(Lifecycle.PER_CLASS)
public interface TestLifeCycleLogger {
@BeforeAll
default void beforeAllTests()
{
	System.out.println("BeforeAll executed");
}
@AfterAll
default void AfterAllTests()
{
	System.out.println("AfterAll executed");
}
@Test
default void TestMethod()
{
	System.out.println("Test executed");
}
}
