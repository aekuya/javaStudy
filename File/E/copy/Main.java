package File.E.copy;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("data.txt"));
			while (true) {
				// BufferedReader ��ü�� readLine() �޼ҵ带 ���� ���δ��� �б� ����.
				String line = br.readLine();
				if (line == null)
					break; 
				System.out.println(line);
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}