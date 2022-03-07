package junit5Mar7;
import static org.junit.Assert.assertNotNull;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
public class ParameterizedTestDemo {
@ParameterizedTest
@ValueSource(strings= {"1","2","three","4"})
void withValueSource(String number)
{
	assertNotNull(number);
}
}
