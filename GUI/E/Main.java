package GUI.E;

import javax.swing.SwingUtilities;

public class Main {
	public static void main(String[] args) {
		// 다음 코드는 GUI 윈도우 객체를 만들고 화면에 표시하는 작업(new Window().setVisible(true);)을
		// 스레드로 구동시키는 방법이다.
		// GUI 윈도우의 외양과 동작을 정의하는 코드는 별도의 Window 클래스로 정의된다.
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Window().setVisible(true);
			}
		});
	}
}