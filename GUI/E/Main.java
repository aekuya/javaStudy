package GUI.E;

import javax.swing.SwingUtilities;

public class Main {
	public static void main(String[] args) {
		// ���� �ڵ�� GUI ������ ��ü�� ����� ȭ�鿡 ǥ���ϴ� �۾�(new Window().setVisible(true);)��
		// ������� ������Ű�� ����̴�.
		// GUI �������� �ܾ�� ������ �����ϴ� �ڵ�� ������ Window Ŭ������ ���ǵȴ�.
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Window().setVisible(true);
			}
		});
	}
}