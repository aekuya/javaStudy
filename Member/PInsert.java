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
		JLabel LName = new JLabel("ȫ�浿");
		JLabel LPhone= new JLabel("��ȭ��ȣ");
		JLabel LGender= new JLabel("����");
		JLabel LLocation= new JLabel("�������");
		JLabel LDay= new JLabel("��������");
		
		
		JLabel LText= new JLabel("���Ե���");
		
		JTextField TName = new JTextField(15);
		JTextField TPhone = new JTextField(15);
		JTextArea TText = new JTextArea(3,60);
		JRadioButton R1 = new JRadioButton("����"); 
		JRadioButton R2 = new JRadioButton("����");
		ButtonGroup checkGroup = new ButtonGroup();
		checkGroup.add(R1);
		checkGroup.add(R2);
		
		JButton BInsert = new JButton("ȸ�����");
		JButton BReset = new JButton("�ʱ�ȭ");
		
		
	}
}
