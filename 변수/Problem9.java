package 변수;

import javax.swing.JOptionPane;

public class Problem9 {

	public static void main(String[] args) {
		String s;
		double kg;
		double m;
		double bmi;
		
		s = JOptionPane.showInputDialog("체중(kg)값을 입력하세요 :");
		kg = Integer.parseInt(s);
		s = JOptionPane.showInputDialog("신장(cm)를 입력하세요 :");
		m = (Integer.parseInt(s) / 100.0);
		bmi = kg / (m * m);
		JOptionPane.showMessageDialog(null, "BMI = " +bmi);
	}

}
