package ����;

import javax.swing.JOptionPane;

public class Problem8 {

	public static void main(String[] args) {
		String s;
		double f;
		double c;
		
		s = JOptionPane.showInputDialog("ȭ��(F) �µ����� �Է��Ͻÿ�");
		f = Integer.parseInt(s);
		c = (f-32.0) * 5.0/9.0;
		JOptionPane.showMessageDialog(null,
				"ȭ���µ� "+f+"(F)���� ���� "+c+" (C)�� �Դϴ�.");
	}

}
