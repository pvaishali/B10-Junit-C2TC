package junit5Mar7;
import org.junit.jupiter.api.RepeatedTest;
public class RepeatingTest {
@RepeatedTest(50)
void test() {
	System.out.println("hi");
	
}
}
