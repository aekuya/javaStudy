package File.C.copy;

import java.io.FileWriter;

public class Main {
	public static void main(String[] args) {
		try {
			FileWriter w = new FileWriter("data.txt");
			// BufferedWriter w=new BufferedWriter(new FileWriter("data.txt"));
			//Buffering
			w.write("�ȳ��ϼ���!\nGood afternoon. \n"); 
			char cbuf[] = { '��', '��', '��', '��', '��', '.', '\n' };
			w.write(cbuf); // ��ü w�� ���� ���� �迭 cbuf�� ������ write()�Ѵ�.
			w.write('��'); // ��ü w�� ���� ���� '��'�� write()�Ѵ�.
			w.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}