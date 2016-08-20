package Thread.C;

 class Runnable_Consonant implements Runnable {
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

class Runnable_Vowel implements Runnable {
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

public class Main {
	public static void main(String[] args) {
		new Thread(new Runnable_Consonant()).start();
		new Thread(new Runnable_Vowel()).start();
	}
}