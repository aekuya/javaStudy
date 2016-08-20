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
		for (char c = '��'; c <= '��'; c++) { // '��'���� '��'���� ���� ���
			System.out.print(c + " ");
			try {
				Thread.sleep(100);
			} catch (Exception e) {
			} // 0.1�� ���
		}
	}
}

class Thread_Vowel extends Thread {
 	@Override
	public void run() {
		for (char c = '��'; c <= '��'; c++) { // '��'���� '��'���� ���� ���
			System.out.print(c + " ");
			try {
				Thread.sleep(100);
			} catch (Exception e) {
			} // 0.1�� ���
		}
	}
}