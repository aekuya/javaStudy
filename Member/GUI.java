package Member;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class GUI extends JFrame{
	public GUI(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,400);
		setLocationRelativeTo(null);
		JTabbedPane Tab = new JTabbedPane();
		Tab.add(new PSearch());
		Tab.add(new PInsert());
		Tab.add(new PDelete());
		add(Tab);
		setVisible(true);
		
	}
}
