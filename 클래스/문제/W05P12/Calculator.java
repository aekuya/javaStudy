package 클래스.문제.W05P12;

public class Calculator {

	private double op1;
	private double op2;
	private String operator;
	private double answer;

	public void setOperands(int op1, int op2) {
		this.op1 = op1;
		this.op2 = op2;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public void doCalculation() {
		// cntl+shift+F 자동정렬. 와
		switch (operator) {
		case "+":
			answer = op1 + op2;
			break;
		case "-":
			answer = op1 - op2;
			break;
		case "*":
			answer = op1 * op2;
			break;
		case "/":
			if (op2 != 0)
				answer = op1 / op2;
			break;
		default:
			break;
		}

	}

	@Override
	public String toString() {
		return op1 + " " + operator + " " + op2 + " = " + answer;
	}

}
