package GUI.BMI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener {
	JPanel pMain;
	JLabel lText1;
	JLabel lText2;
	JTextField tHeight;
	JTextField tWeight;
	JButton bTrans;
	String tHeightString;
	String tWeightString;
	
	public MyFrame() {
		pMain = new JPanel();
		lText1 = new JLabel("����(cm)�� �Է��ϼ��� ");
		lText2 = new JLabel("ü��(kg)�� �Է��ϼ��� ");
		
		tHeight = new JTextField(8);
		tHeight.addKeyListener(new MyKeyAdapter());
		
		tWeight = new JTextField(8);
		tWeight.addKeyListener(new MyKeyAdapter());
		
		
		add(pMain);
		bTrans = new JButton("������(BMI)���");
		bTrans.addActionListener(this);
		pMain.setMaximumSize(new Dimension(200, 300));;
		pMain.setLayout(new FlowLayout());
		
		pMain.add(lText1);
		pMain.add(tHeight);
		pMain.add(lText2);
		pMain.add(tWeight);
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
			
				String check;
				double height = Double.parseDouble(tHeight.getText())/100;
				double weight = Double.parseDouble(tWeight.getText());
				double bmi = weight / (height* height);
				
				if(bmi<20) check="��ü��";
				else if(bmi<25) check="����";
				else if(bmi<30) check="��ü��";
				else if(bmi<40) check="��";
				else check="����";
				
				System.out.println(bmi+check);
				
				JOptionPane.showMessageDialog(null,
						String.format("����� BMI�� %.2f�̰� <%s>�Դϴ�.",bmi,check));
			
		}
	}
	
	//����ʹ� �ݵ�� �������ϴ� �޼������ �⺻������ �Ų���.
	class MyKeyAdapter extends KeyAdapter{
		@Override
		public void keyReleased(KeyEvent e) {
			JTextField s = (JTextField) e.getSource();
			String curText = s.getText();
			
			try {
				if ( !curText.isEmpty()){			
					if(curText.equals("-")) throw new NumberFormatException();
					Double.parseDouble(curText);
				}
				if(s == tHeight) tHeightString = curText;
				else tWeightString = curText;
				
			} catch (NumberFormatException numE) {
				JOptionPane.showMessageDialog(null,"�߸��� �Է��Դϴ�.","����",
						JOptionPane.WARNING_MESSAGE);
				
				if(s== tHeight) s.setText(tHeightString);
				else s.setText(tWeightString);
			}
		}
		
	}
}
