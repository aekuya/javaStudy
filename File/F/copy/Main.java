package File.F.copy;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/*
public class Main {
	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(new FileReader("data.txt"));
			while (scanner.hasNext()) { // scanner.hasNext() => ������ ���� ��ġ�� �� ����
										// ������ ���� ������ true, �׷��� ������ false
				String line = scanner.nextLine(); // ������ ���� ��ġ���� ���� ����(���ڿ�)�� �о�
													// line�� ����.
				System.out.println(line); // �о� ���� ���� ���ڿ��� ȭ�鿡 ���.
			}
			scanner.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}*/
/*
public class Main {
	public static void main(String[] args) {
		try {
			PrintWriter pw = new PrintWriter("data.formated.txt");
			String name = "Obama";
			int score = 97;
			pw.println("Hi");
			pw.printf("%s \t %d \r\n", name, score); 
			//���ڿ� ����Ʈ�� ����. ���๮�� ó��(������ /r/n)
			pw.close();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
}
*/
/*
public class Main {
	public static void main(String[] args) {
		Scanner si = new Scanner(System.in);
		while (true) {
			String line = si.nextLine();
			if (line.equals("bye"))
				break; // Ű���忡�� bye[enter]�� �Է��ϸ� while ������ Ż���Ѵ�.
			System.out.println(line.length()); // Ű���忡�� ���� �� ���� ���ڿ��� ���� ������ ����Ͽ�
												// ȭ�鿡 ����Ѵ�.
		}
		si.close();
	}
}
*/
/*
public class Main {
	public static void main(String[] args) {
		try {
			// �Ʒ� �ڵ��� UTF-8�� EUC-KR�� �����Ͽ� ������ �� ��
			PrintWriter oF = new PrintWriter(new OutputStreamWriter(new FileOutputStream("data.UTF-8"), "UTF-8"));
			oF.println("���ع��� ��λ��� ������ �⵵��");
			oF.println("�ϴ����� �����ϻ� �츮���� ����");
			oF.flush();
			oF.close();
		} catch (Exception e) {
		}
	}
}
*/
public class Main {
	public static void main(String[] args) {
		try {
			// �Ʒ� �ڵ��� UTF-8�� EUC-KR�� �����Ͽ� ������ �� ��
			BufferedReader iF = new BufferedReader(new InputStreamReader(new FileInputStream("data.UTF-8"), "UTF-8"));
			while (true) {
				String line = iF.readLine();
				if (line == null)
					break;
				System.out.println(line);
			}
			iF.close();
		} catch (Exception e) {
		}
	}
}