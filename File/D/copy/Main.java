package File.D.copy;

import java.io.FileReader;

public class Main {
	public static void main(String[] args) {
		try {
			FileReader r = new FileReader("data.txt");
			// BufferedReader r=new BufferedReader(new FileReader("data.txt"));
			while (true) {
				int data = r.read(); 
				if (data == -1)
					break;
				char ch = (char) data;
				System.out.print(ch);
			}
			r.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}