package com.neuralnetwork.hopfield;

public class Matrix {
	public static double[][] createMatrix(int n, int m) {
		return new double[n][m];
	}

	public static double[] matrixVectorMultiplication(double[][] matrix, double[] vector) {
		int n = matrix.length;
		int m = matrix[0].length;
		double[] results = new double[matrix.length];
		for (int i = 0; i < n; i++) {
			double sum = 0;
			for (int j = 0; j < m; j++)
				sum += matrix[i][j] * vector[j];
			results[i] = sum;
		}
		return results;
	}
	public static double[][] outerProduct(double[] vector){
		double[][] matrix = createMatrix(vector.length,vector.length);
		for(int i=0; i<vector.length; i++)
			for(int j =0; j<vector.length; j++)
				matrix[i][j] = vector[i]*vector[j];
		return matrix;
	}
	public static double[][] addMatrix(double[][] m1, double[][] m2){
		double[][] result = createMatrix(m1.length, m1[0].length);
		for(int i=0; i<m1.length; i++)
			for(int j =0; j<m1[0].length; j++)
				result[i][j] = m1[i][j] + m2[i][j];
		return result;
	}
	public static double[][] clearDiagonal(double[][] matrix){
		for(int i=0; i<matrix.length; i++)
			matrix[i][i] = 0;
		return matrix;
	}


}
