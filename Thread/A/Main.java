package Thread.A;

/*
public class Main {
	public static void main(String[] args) {
		for (char c = 'ㄱ'; c <= 'ㅎ'; c++) { // 작업-I: 'ㄱ'부터 'ㅎ'까지 자음 출력
			System.out.print(c + " ");
			try {
				Thread.sleep(100);
			} catch (Exception e) {
			} // 0.1초 대기
		}
		for (char c = 'ㅏ'; c <= 'ㅣ'; c++) { // 작업-II: 'ㅏ'부터 'ㅣ'까지 모음 출력
			System.out.print(c + " ");
			try {
				Thread.sleep(100);
			} catch (Exception e) {
			} // 0.1초 대기
		}
	}
}
*/
class Main {
	public static void main(String[] args) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (char c = 'ㄱ'; c <= 'ㅎ'; c++) { // 작업-I: 'ㄱ'부터 'ㅎ'까지 자음 출력
					System.out.print(c + " ");
					try {
						Thread.sleep(100);
					} catch (Exception e) {
					} // 0.1초 대기
				}
			}
		}).start();
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (char c = 'ㅏ'; c <= 'ㅣ'; c++) { // 작업-II: 'ㅏ'부터 'ㅣ'까지 모음 출력
					System.out.print(c + " ");
					try {
						Thread.sleep(100);
					} catch (Exception e) {
					} // 0.1초 대기
				}
			}
		}).start();
	}
}