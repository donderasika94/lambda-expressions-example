package com.capgemini.lambda_expression.client;

import com.capgemini.lambda_expression.model.Calculator;

public class CalculatorClient {
	public static void main(String[] args) {
		Calculator addition = (x,y)-> x+y;
		System.out.println(addition.calculate(23, 90));
		
		Calculator subtraction = (x,y)-> x-y;
		System.out.println(addition.calculate(12, 9));
		
	}

}


