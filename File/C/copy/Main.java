package File.C.copy;

import java.io.FileWriter;

public class Main {
	public static void main(String[] args) {
		try {
			FileWriter w = new FileWriter("data.txt");
			// BufferedWriter w=new BufferedWriter(new FileWriter("data.txt"));
			//Buffering
			w.write("안녕하세요!\nGood afternoon. \n"); 
			char cbuf[] = { '반', '갑', '습', '니', '다', '.', '\n' };
			w.write(cbuf); // 객체 w에 대해 문자 배열 cbuf의 내용을 write()한다.
			w.write('끝'); // 객체 w에 대해 문자 '끝'을 write()한다.
			w.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}