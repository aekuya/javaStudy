package GUI.TempConv;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener {
	JPanel pMain;//패널
	JLabel lText;//라벨
	JTextField tNum;//숫자입력칸
	JButton bTrans;//변환 버튼
	String tNumString="";//이전에 입력한 숫자
	
	public MyFrame() {
		pMain = new JPanel();
		lText = new JLabel("화씨 온도 : ");
		tNum = new JTextField(8);
		tNum.addKeyListener(new KeyAdapter() {
			//글자입력제한(잘못된 문자열 -> tNumString으로 되돌리기)
			public void keyReleased(KeyEvent e) {//키보드를 땔때
				JTextField s = (JTextField) e.getSource();
				String curText = s.getText();
				try {
					if ( !curText.isEmpty() && !curText.equals("-"))
						Double.parseDouble(curText);
					tNumString = curText;
				} catch (NumberFormatException numE) {
					JOptionPane.showMessageDialog(null,"잘못된 입력입니다.","오류",
							JOptionPane.WARNING_MESSAGE);
					s.setText(tNumString);
				}
			}
		});
		
		add(pMain);
		bTrans = new JButton("변환");
		bTrans.addActionListener(this);
		pMain.setMaximumSize(new Dimension(200, 300));;
		pMain.setLayout(new FlowLayout());
		
		pMain.add(lText);
		pMain.add(tNum);
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
			
				double fahrenheit = Double.parseDouble(tNum.getText());
				double celsius = (fahrenheit - 32.0) / 1.8;
				JOptionPane.showMessageDialog(null,
						String.format("화씨온도 %.4f 도는 섭씨온도 %.4f도입니다.", fahrenheit, celsius));
			
		}
	}

}
