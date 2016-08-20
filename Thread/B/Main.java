package Thread.B;

public class Main {
	public static void main(String[] args) {
		new Thread_Consonant().start();
		new Thread_Vowel().start();
	}
}

class Thread_Consonant extends Thread {
	@Override
	public void run() {
		for (char c = 'ㄱ'; c <= 'ㅎ'; c++) { // 'ㄱ'부터 'ㅎ'까지 자음 출력
			System.out.print(c + " ");
			try {
				Thread.sleep(100);
			} catch (Exception e) {
			} // 0.1초 대기
		}
	}
}

class Thread_Vowel extends Thread {
 	@Override
	public void run() {
		for (char c = 'ㅏ'; c <= 'ㅣ'; c++) { // 'ㅏ'부터 'ㅣ'까지 모음 출력
			System.out.print(c + " ");
			try {
				Thread.sleep(100);
			} catch (Exception e) {
			} // 0.1초 대기
		}
	}
}