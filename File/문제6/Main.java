package File.����6;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
	public static void main(String[] args) {
		try {
			// 0= �ؽ�Ʈ���ϸ� , ���μ�
			BufferedReader in = new BufferedReader(new FileReader(args[0]));
			for (int i = 0; i < Integer.parseInt(args[1]); i++) {
				String line = in.readLine();
				System.out.println(line);
			}
			in.close();
		} catch (Exception e) {
			System.out.println("�߸��� ���ϸ��Դϴ�.");
		}
	}

}
