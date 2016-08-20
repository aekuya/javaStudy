package File.F.copy;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/*
public class Main {
	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(new FileReader("data.txt"));
			while (scanner.hasNext()) { // scanner.hasNext() => 파일의 현재 위치에 더 읽을
										// 내용이 남아 있으면 true, 그렇지 않으면 false
				String line = scanner.nextLine(); // 파일의 현재 위치에서 다음 라인(문자열)을 읽어
													// line에 저장.
				System.out.println(line); // 읽어 들인 라인 문자열을 화면에 출력.
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
			//문자와 바이트의 차이. 개행문자 처리(윈도우 /r/n)
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
				break; // 키보드에서 bye[enter]를 입력하면 while 루프를 탈출한다.
			System.out.println(line.length()); // 키보드에서 읽은 한 라인 문자열의 문자 개수를 계산하여
												// 화면에 출력한다.
		}
		si.close();
	}
}
*/
/*
public class Main {
	public static void main(String[] args) {
		try {
			// 아래 코드의 UTF-8을 EUC-KR로 변경하여 실행해 볼 것
			PrintWriter oF = new PrintWriter(new OutputStreamWriter(new FileOutputStream("data.UTF-8"), "UTF-8"));
			oF.println("동해물과 백두산이 마르고 닳도록");
			oF.println("하느님이 보우하사 우리나라 만세");
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
			// 아래 코드의 UTF-8을 EUC-KR로 변경하여 실행해 볼 것
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