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
		lText1 = new JLabel("신장(cm)를 입력하세요 ");
		lText2 = new JLabel("체중(kg)을 입력하세요 ");
		
		tHeight = new JTextField(8);
		tHeight.addKeyListener(new MyKeyAdapter());
		
		tWeight = new JTextField(8);
		tWeight.addKeyListener(new MyKeyAdapter());
		
		
		add(pMain);
		bTrans = new JButton("비만지수(BMI)계산");
		bTrans.addActionListener(this);
		pMain.setMaximumSize(new Dimension(200, 300));;
		pMain.setLayout(new FlowLayout());
		
		pMain.add(lText1);
		pMain.add(tHeight);
		pMain.add(lText2);
		pMain.add(tWeight);
		pMain.add(bTrans);
	
		this.setTitle("온도변환기");
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
				
				if(bmi<20) check="저체중";
				else if(bmi<25) check="정상";
				else if(bmi<30) check="과체중";
				else if(bmi<40) check="비만";
				else check="고도비만";
				
				System.out.println(bmi+check);
				
				JOptionPane.showMessageDialog(null,
						String.format("당신의 BMI는 %.2f이고 <%s>입니다.",bmi,check));
			
		}
	}
	
	//어댑터는 반드시 적여야하는 메서드들을 기본값으로 매꿔줌.
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
				JOptionPane.showMessageDialog(null,"잘못된 입력입니다.","오류",
						JOptionPane.WARNING_MESSAGE);
				
				if(s== tHeight) s.setText(tHeightString);
				else s.setText(tWeightString);
			}
		}
		
	}
}
