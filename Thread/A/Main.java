package Thread.A;

/*
public class Main {
	public static void main(String[] args) {
		for (char c = '��'; c <= '��'; c++) { // �۾�-I: '��'���� '��'���� ���� ���
			System.out.print(c + " ");
			try {
				Thread.sleep(100);
			} catch (Exception e) {
			} // 0.1�� ���
		}
		for (char c = '��'; c <= '��'; c++) { // �۾�-II: '��'���� '��'���� ���� ���
			System.out.print(c + " ");
			try {
				Thread.sleep(100);
			} catch (Exception e) {
			} // 0.1�� ���
		}
	}
}
*/
class Main {
	public static void main(String[] args) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (char c = '��'; c <= '��'; c++) { // �۾�-I: '��'���� '��'���� ���� ���
					System.out.print(c + " ");
					try {
						Thread.sleep(100);
					} catch (Exception e) {
					} // 0.1�� ���
				}
			}
		}).start();
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (char c = '��'; c <= '��'; c++) { // �۾�-II: '��'���� '��'���� ���� ���
					System.out.print(c + " ");
					try {
						Thread.sleep(100);
					} catch (Exception e) {
					} // 0.1�� ���
				}
			}
		}).start();
	}
}