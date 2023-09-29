package org.java.valculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.java.calculator.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

	
	@Test
	@DisplayName("test somma")
	public void checkAdd () {
	assertEquals(25, Calculator.add(20, 5));
	}
	@Test
	@DisplayName("test sottrazione")
	public void checksubtract () {
	assertEquals(20, Calculator.subtract(25, 5));
	}
	@Test
	@DisplayName("test divisione")
	public void checkdivide () throws Exception {
	assertEquals(5, Calculator.divide(25, 5));
	}
	@Test
	@DisplayName("test divisione di 0")
	public void checkDivisionByZero() {
		assertThrows(Exception.class,
				() -> Calculator.divide(10, 0),
				"mostra l'eccezione per la divisione di zero");
	}
	@Test
	@DisplayName("test moltiplicazione")
	public void checkmultiply () {
	assertEquals(125, Calculator.multiply(25, 5));
	}
}
