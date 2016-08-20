package File.E.copy;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("data.txt"));
			while (true) {
				// BufferedReader 객체는 readLine() 메소드를 통해 라인단위 읽기 가능.
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