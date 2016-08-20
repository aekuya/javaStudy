package 변수;

import javax.swing.JOptionPane;

public class Problem10 {

	public static void main(String[] args) {
		String s;
		double v1;
		double v2;

		s = JOptionPane.showInputDialog("첫째 수를 입력하세요 :");
		v1 = Integer.parseInt(s);
		s = JOptionPane.showInputDialog("둘째 수를 입력하세요 :");
		v2 = Integer.parseInt(s);
		JOptionPane.showMessageDialog(null, v1+" + "+v2+" = "+(v1+v2)
				+"\n"+v1+" - "+v2+" = "+(v1-v2)
				+"\n"+v1+" x "+v2+" = "+(v1*v2)
				+"\n"+v1+" / "+v2+" = "+(v1/v2));
	}

}
