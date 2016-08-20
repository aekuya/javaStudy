package GUI.C;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Window extends JFrame {
	JTextField jTextField1 = new JTextField(20);
	JTextField jTextField2 = new JTextField(20);
	JButton jButton = new JButton("ADD");

	public Window() {
		setTitle("µ¡¼À±â"); // this.setTitle("µ¡¼À±â"); ¿Í µ¿ÀÏ
		setLayout(new FlowLayout());
		add(jTextField1);
		add(new JLabel("+"));
		add(jTextField2);
		add(jButton);
		jButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double n1 = Double.parseDouble(jTextField1.getText());
				double n2 = Double.parseDouble(jTextField2.getText());
				JOptionPane.showMessageDialog(null, n1 + n2);
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
	}

	public static void main(String[] args) {
		new Window().setVisible(true);
	}
}
