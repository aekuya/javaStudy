package GUI.A;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Main {
	public static void main(String[] args) {
		JFrame jFrame = new JFrame();
		JLabel jLabel = new JLabel("�漺���б�");
		JTextArea jTextArea = new JTextArea(10,10);
		JScrollPane jScrollPane = new JScrollPane(jTextArea);
		jFrame.setLayout(new FlowLayout());
		jFrame.add(jScrollPane);
		jFrame.setSize(new Dimension(300, 300));
		// ȭ�� �ػ󵵸� ����
		Dimension monitorSize = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frameSize = jFrame.getSize();

		jFrame.setLocation(new Point((int) (monitorSize.getWidth() / 2 - frameSize.getWidth() / 2),
				(int) (monitorSize.getHeight() / 2 - frameSize.getHeight() / 2)));
		jFrame.add(jLabel);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setTitle("���� ù ���α׷�");
		jFrame.setVisible(true);
	}
}
