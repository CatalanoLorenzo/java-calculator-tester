package org.java.calculator;

public class Calculator {
	
	public static float add (float numerouno, float numerodue) {
		return numerouno + numerodue;
		}
	public static float subtract (float numerouno, float numerodue) {
		return numerouno - numerodue;
	}
	public static float divide (float numerouno, float numerodue) throws Exception {
		if(numerodue == 0) {
			throw new Exception ("non puoi dividere per zero");
		}
		return numerouno / numerodue;
	}
	public static float multiply (float numerouno, float numerodue) {
		return numerouno * numerodue;
	}
}
