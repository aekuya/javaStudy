package Ŭ����.����.W06P04;

public class W06P04 {
	public static void main(String[] args) {
		int sum = 0;
		for (String param : args) {
			param= param.replace(" ", "");
			if (isalpha(param))
				sum += Integer.parseInt(param);
		}
		System.out.println(sum);
	}

	public static boolean isalpha(String string) {

		string = string.replace(" ","");//��������
		for (int i = 0; i < string.length(); i++) {
			char c = string.charAt(i);
			if (c < 48 || c > 57) {// ���ڰ� �ƴ� ���
				return false;
			}
		}
		return true;

	}
}
