package GUI.F;

import java.io.File;
import java.io.FileReader;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Main {
	public static void main(String[] args) {
		try {
			JFrame jFrame = new JFrame();
			JTextArea jTextArea = new JTextArea();
			JScrollPane jScrollPane = new JScrollPane(jTextArea);
			jFrame.add(jScrollPane);
			File iFile = new File("C:\\Users\\user\\Desktop\\Jiwon\\JavaHomework\\src\\GUI\\F\\Main.java");
			char cbuf[] = new char[(int) iFile.length()];
			new FileReader(iFile).read(cbuf);
			jTextArea.setText(new String(cbuf));
			jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			jFrame.pack();
			jFrame.setVisible(true);
		} catch (Exception e) {
		}
	}
}