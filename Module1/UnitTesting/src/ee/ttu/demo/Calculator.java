package ee.ttu.demo;

public class Calculator {

	public Calculator() {

	}

	public static void main(String[] args) {
		new Calculator();

	}

	public int add(int num1, int num2) {
		return num1 + num2;
	}

	public int sub(int num1, int num2) {
		return num1 - num2;
	}

	public void div(int i, int divisor) {
		if(divisor == 0){
			throw new IllegalArgumentException("Argument 'divisor' is 0");
		}
		
	}

}
