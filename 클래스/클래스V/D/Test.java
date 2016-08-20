package 클래스.클래스V.D;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Test {
	public static void main(String[] args) {
		JFrame w = new JFrame();
		JButton button = new JButton("OK");
		ActionListener actionListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Hi");
			}
		};
		button.addActionListener(actionListener);
		w.add(button);
		w.setVisible(true); 
		w.setLocation(300, 300);
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		w.pack();
	}
}