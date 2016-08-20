package Thread.C;

 class Runnable_Consonant implements Runnable {
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

class Runnable_Vowel implements Runnable {
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

public class Main {
	public static void main(String[] args) {
		new Thread(new Runnable_Consonant()).start();
		new Thread(new Runnable_Vowel()).start();
	}
}