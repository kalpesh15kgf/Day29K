import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumtionDemo {
@Test
void testonBlock() {
	System.setProperty("ENV" ,"DEV");
	Assumptions.assumeTrue("DEV".equals(System.getProperty("ENV")));
}
@Test
void testonProd() {
	System.setProperty("ENV" ,"PROD");
	Assumptions.assumingThat("DEV".equals(System.getProperty("ENV")), null);
}
private static String message() {
	return "Today's TEST Execution Failed ::";
	
}
}
