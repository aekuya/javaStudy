package ����;

import javax.swing.JOptionPane;

public class Problem10 {

	public static void main(String[] args) {
		String s;
		double v1;
		double v2;

		s = JOptionPane.showInputDialog("ù° ���� �Է��ϼ��� :");
		v1 = Integer.parseInt(s);
		s = JOptionPane.showInputDialog("��° ���� �Է��ϼ��� :");
		v2 = Integer.parseInt(s);
		JOptionPane.showMessageDialog(null, v1+" + "+v2+" = "+(v1+v2)
				+"\n"+v1+" - "+v2+" = "+(v1-v2)
				+"\n"+v1+" x "+v2+" = "+(v1*v2)
				+"\n"+v1+" / "+v2+" = "+(v1/v2));
	}

}
