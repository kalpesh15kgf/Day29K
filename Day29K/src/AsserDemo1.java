import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class AsserDemo1 {
@Test
public void simple() {
	int A = 1;
	int B = 1;
	assertEquals(A,B);
	System.out.println("sample");
}
@Test
public void simple1() {
	int A = 1;
	int B = 1;
	assertEquals(A,B);
	System.out.println("sample 1");
}
@Disabled
public void simple2() {
	int A = 1;
	int B = 3;
	assertEquals(A,B);
	System.out.println("sample 2");
}
}
