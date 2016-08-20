package 클래스.문제.W05P12;

public class W05P12 {
	public static void main(String[] args){
		Calculator calc = new Calculator();
		calc.setOperands(12,34);
		calc.setOperator("+");
		calc.doCalculation();
		System.out.println(calc);
		
		calc.setOperator("-");
		calc.doCalculation();
		System.out.println(calc);
		
		calc.setOperands(32,12);
		calc.doCalculation();
		System.out.println(calc);
		
		calc.setOperator("*");
		calc.doCalculation();
		System.out.println(calc);
		
		calc.setOperator("/");
		calc.doCalculation();
		System.out.println(calc);
	}
}
