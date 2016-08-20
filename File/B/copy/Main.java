package File.B.copy;

import java.io.FileInputStream;

public class Main {
	public static void main(String[] args) {
		try {
			FileInputStream is = new FileInputStream("data.bin");
			// BufferedInputStream is=new BufferedInputStream(new
			// FileInputStream("data.bin"));
			while (true) {
				int data = is.read(); 
				if (data == -1)
					break; 
				byte byteData = (byte) data;
				System.out.printf("%02X\n", byteData); 
				// 바이트값을 16진수로 출력한다. 
				//	41 42 43 0A가 출력됨. 16진수
				// 41은 65='A', 0A는 10='\n'
			}
			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}