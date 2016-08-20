package File.A.copy;
/**
 * 바이너리(바이트) 입출력
 * FileInputStream 한 바이트 읽기
 * FileOutPutStream 한 바이트 쓰기
 * BufferedInputStream(기본 입력에 버퍼를 사용)
 * BufferedOutputStream(기본 출력에 버퍼를 사용)
 
 * 텍스트(문자)입출력
 * FileReader 한 글자읽기(2바이트)
 * FileWriter 한 글자쓰기(2바이트)
 * BufferedReader 버퍼사용 = 여러글자읽기
 * BufferedWriter 버퍼사용 = 여러글자쓰기
 * PrintWriter 형식(printf)에 맞춰서 쓰기
 
 * 바이너리 - 텍스트 변환
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