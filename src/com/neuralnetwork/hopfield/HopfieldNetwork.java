package com.neuralnetwork.hopfield;

public class HopfieldNetwork {
	double[][] weightMatrix;

	public HopfieldNetwork(int dimension) {
		this.weightMatrix = Matrix.createMatrix(dimension, dimension);
	}

	public void train(double[] vector) {
		double[] transformVector = Utils.transform(vector);
		double[][] weightMatrix = Matrix.outerProduct(transformVector);
		weightMatrix = Matrix.clearDiagonal(weightMatrix);
		this.weightMatrix = Matrix.addMatrix(weightMatrix, this.weightMatrix);

	}

	public void recall(double[] vector) {
		double[] transfromVector = Utils.transform(vector);
		double[] output = Matrix.matrixVectorMultiplication(this.weightMatrix, transfromVector);
		for (int i = 0; i < output.length; i++)
			output[i] = ActivationFunction.stepFunction(output[i]);
		for (int i = 0; i < output.length; i++)
			if (output[i] != vector[i]) {
				System.out.println("Pattern not recognised...");
				return;
			}
		System.out.println("Patterm remebered!");
	}

}
