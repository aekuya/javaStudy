package 변수;

import javax.swing.JOptionPane;

public class Problem8 {

	public static void main(String[] args) {
		String s;
		double f;
		double c;
		
		s = JOptionPane.showInputDialog("화씨(F) 온도값을 입력하시오");
		f = Integer.parseInt(s);
		c = (f-32.0) * 5.0/9.0;
		JOptionPane.showMessageDialog(null,
				"화씨온도 "+f+"(F)도는 섭씨 "+c+" (C)도 입니다.");
	}

}
