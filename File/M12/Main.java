package File.M12;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {
	private static FileInputStream in;

	public static void main(String[] args) {
		int count = 0;

		try {
			in = new FileInputStream(args[0]);
			int data = 0;
			while (data != -1) {
				data = in.read();
				count++;
			}
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(count);

	}
}
