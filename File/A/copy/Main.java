package File.A.copy;
/**
 * ���̳ʸ�(����Ʈ) �����
 * FileInputStream �� ����Ʈ �б�
 * FileOutPutStream �� ����Ʈ ����
 * BufferedInputStream(�⺻ �Է¿� ���۸� ���)
 * BufferedOutputStream(�⺻ ��¿� ���۸� ���)
 
 * �ؽ�Ʈ(����)�����
 * FileReader �� �����б�(2����Ʈ)
 * FileWriter �� ���ھ���(2����Ʈ)
 * BufferedReader ���ۻ�� = ���������б�
 * BufferedWriter ���ۻ�� = �������ھ���
 * PrintWriter ����(printf)�� ���缭 ����
 
 * ���̳ʸ� - �ؽ�Ʈ ��ȯ
 * InputStreamReader
 * OutputStreamWriter
 */
import java.io.FileOutputStream;

public class Main {
	public static void main(String[] args) {
		try {
			FileOutputStream os = new FileOutputStream("data.txt");
			// BufferedOutputStream os=new BufferedOutputStream(new
			// FileOutputStream("data.txt"));
			os.write("ABC\n".getBytes()); 
			os.close();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
}