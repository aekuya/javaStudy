package GUI.E;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Window extends JFrame implements ActionListener {
	JTextField jTextField1 = new JTextField(20);
	JTextField jTextField2 = new JTextField(20);
	JButton jButton = new JButton("ADD");

	public Window() {
		this.setTitle("µ¡¼À±â");
		setLayout(new FlowLayout());
		add(jTextField1);
		add(new JLabel("+"));
		add(jTextField2);
		add(jButton);
		jButton.addActionListener(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		double n1 = Double.parseDouble(jTextField1.getText());
		double n2 = Double.parseDouble(jTextField2.getText());
		JOptionPane.showMessageDialog(null, n1 + n2);
	}

	public static void main(String[] args) {
		new Window().setVisible(true);
	}
}