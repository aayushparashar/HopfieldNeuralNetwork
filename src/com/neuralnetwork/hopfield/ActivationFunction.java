package com.neuralnetwork.hopfield;

public class ActivationFunction {
	public static double stepFunction(double val) {
		if (val < 0)
			return -1;
		else
			return 1;
	}

}
