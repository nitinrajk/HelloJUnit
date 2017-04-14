package com.bharath.trainings.junit;

public class CalculatorImpl implements Calculator {

	public int add(int num1, int num2) {
		return num1 + num2;
	}

	public int subtract(int num1, int num2) {
		if (num1 > num2) {
			return num1 - num2;
		} else if (num1 < num2) {
			return num2 - num1;
		}
		return 0;
	}

	public int multiply(int num1, int num2) {
		return num1 * num2;
	}

	public int quotient(int num1, int num2) {
		if (num1 != 0 || num2 != 0) {
			if (num1 > num2) {
				return num1 / num2;
			} else if (num1 < num2) {
				return num2 / num1;
			}
		} else {
			throw new ArithmeticException();
		}
		return 0;
	}
	
	public int remainder(int num1, int num2){
		if(num1!=0||num2!=0){
			if(num1>num2){
				return num1%num2;
			}
			else if(num1<num2){
				return num2%num1;
			}
		}else{
			throw new ArithmeticException();
		}
		return 0;
	}
}
