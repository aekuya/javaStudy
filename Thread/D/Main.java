package Thread.D;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Main extends JFrame implements ActionListener {
	JTextField input = new JTextField(30);
	JButton button = new JButton("Calculate File Size");

	public Main() {
		setTitle("File Size Calculation");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(input);
		add(button);
		button.addActionListener(this);
		pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// getFileSize(input.getText());
		new Thread(new Runnable() {
			@Override
			public void run() {
				getFileSize(input.getText());
			}
		}).start();
	}

	void getFileSize(String filePath) {
		try {
			long count = 0;
			FileInputStream iF = new FileInputStream(filePath);
			while (true) {
				int data = iF.read();
				if (data < 0)
					break;
				count++;
			}
			iF.close();
			JOptionPane.showMessageDialog(null, filePath + ": " + count + " byte(s)");
		} catch (Exception e) {
		}
	}

	public static void main(String[] argv) {
		new Main().setVisible(true);
	}
}