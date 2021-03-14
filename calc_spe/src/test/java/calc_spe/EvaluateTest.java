package calc_spe;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EvaluateTest {
	@Test
	void evaluate_1() {
		double result = Evaluate.evaluate("√36");
		assertEquals(result, 6 );
	}
	
	@Test
	void evaluate_2() {
		double result = Evaluate.evaluate("ln1");
		assertEquals(result,0);
	}
	
	@Test
	void evaluate_3() {
		double result = Evaluate.evaluate("22^2");
		assertEquals(result,484);
	}
	
	@Test
	void evaluate_4() {
		double result = Evaluate.evaluate("5!");
		assertEquals(result,120);
	}
	
}
