package ����;

import javax.swing.JOptionPane;

public class Problem9 {

	public static void main(String[] args) {
		String s;
		double kg;
		double m;
		double bmi;
		
		s = JOptionPane.showInputDialog("ü��(kg)���� �Է��ϼ��� :");
		kg = Integer.parseInt(s);
		s = JOptionPane.showInputDialog("����(cm)�� �Է��ϼ��� :");
		m = (Integer.parseInt(s) / 100.0);
		bmi = kg / (m * m);
		JOptionPane.showMessageDialog(null, "BMI = " +bmi);
	}

}
