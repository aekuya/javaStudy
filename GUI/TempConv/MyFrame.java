package GUI.TempConv;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener {
	JPanel pMain;//�г�
	JLabel lText;//��
	JTextField tNum;//�����Է�ĭ
	JButton bTrans;//��ȯ ��ư
	String tNumString="";//������ �Է��� ����
	
	public MyFrame() {
		pMain = new JPanel();
		lText = new JLabel("ȭ�� �µ� : ");
		tNum = new JTextField(8);
		tNum.addKeyListener(new KeyAdapter() {
			//�����Է�����(�߸��� ���ڿ� -> tNumString���� �ǵ�����)
			public void keyReleased(KeyEvent e) {//Ű���带 ����
				JTextField s = (JTextField) e.getSource();
				String curText = s.getText();
				try {
					if ( !curText.isEmpty() && !curText.equals("-"))
						Double.parseDouble(curText);
					tNumString = curText;
				} catch (NumberFormatException numE) {
					JOptionPane.showMessageDialog(null,"�߸��� �Է��Դϴ�.","����",
							JOptionPane.WARNING_MESSAGE);
					s.setText(tNumString);
				}
			}
		});
		
		add(pMain);
		bTrans = new JButton("��ȯ");
		bTrans.addActionListener(this);
		pMain.setMaximumSize(new Dimension(200, 300));;
		pMain.setLayout(new FlowLayout());
		
		pMain.add(lText);
		pMain.add(tNum);
		pMain.add(bTrans);
	
		this.setTitle("�µ���ȯ��");
		this.setLocation(600, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.pack();
		this.add(pMain);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (bTrans == e.getSource()) {
			
				double fahrenheit = Double.parseDouble(tNum.getText());
				double celsius = (fahrenheit - 32.0) / 1.8;
				JOptionPane.showMessageDialog(null,
						String.format("ȭ���µ� %.4f ���� �����µ� %.4f���Դϴ�.", fahrenheit, celsius));
			
		}
	}

}
