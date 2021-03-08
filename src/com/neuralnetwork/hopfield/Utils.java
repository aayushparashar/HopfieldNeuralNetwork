package com.neuralnetwork.hopfield;

public class Utils {
	public static double[] transform(double[] arr) {
		for (int i = 0; i < arr.length; i++)
			if (arr[i] == 0)
				arr[i] = -1;
		return arr;
	}

}
