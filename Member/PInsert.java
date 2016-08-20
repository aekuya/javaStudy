package Member;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PInsert extends JPanel {
	public PInsert() {
		JLabel LName = new JLabel("홍길동");
		JLabel LPhone= new JLabel("전화번호");
		JLabel LGender= new JLabel("성별");
		JLabel LLocation= new JLabel("출신지역");
		JLabel LDay= new JLabel("가입일자");
		
		
		JLabel LText= new JLabel("가입동기");
		
		JTextField TName = new JTextField(15);
		JTextField TPhone = new JTextField(15);
		JTextArea TText = new JTextArea(3,60);
		JRadioButton R1 = new JRadioButton("남자"); 
		JRadioButton R2 = new JRadioButton("여자");
		ButtonGroup checkGroup = new ButtonGroup();
		checkGroup.add(R1);
		checkGroup.add(R2);
		
		JButton BInsert = new JButton("회원등록");
		JButton BReset = new JButton("초기화");
		
		
	}
}
