package ���ڿ�;

public class String1 {

	public static void main(String[] args) {
		String s="2015642028������";
		String saveString = new String("2015642028������");
		
		System.out.println(s.charAt(0)+", "+s.charAt(3)+", "+s.charAt(s.length()-1));
		System.out.println(s.concat("������"));//��������� ���ο� ���ڿ�, �ٲ�žƴ�.
		System.out.println(s);
//		s=s.concat("������");//�̰� �ٲ۴ٴ°� �ƴ϶� ���� ���� ��ü�ϴ°�.
//		System.out.println(s);
		System.out.println("s�� '������'�� �����ϰ� �ִ°�? "+s.contains("������")); // ������ true
		System.out.println("s�� '������'�� �����ϰ� �ִ°�? "+s.contains("������")); // ������ false
		System.out.println("s�� '������'�� �����°�? "+s.endsWith("������"));
		
		
		String s3="ABC", s4="ABC"; 
		//��ü�� ��������.
		if(s3.equals(s4)){ 
			System.out.println("s3, s4�� �����ϴ�.");
			 }
			else{
			 System.out.println("s3, s4�� �ٸ��ϴ�.");
			 } 
		//s = ...������������(concat) / saveString = ....������(����)
		if(saveString.equals(s)){
			System.out.println("����.");
		}
		else{
			System.out.println("�ٸ���");
		}
		
//		saveString=saveString.concat("������");//������ ���� ��, ������ �ν��Ͻ��� ���?
		
		if(saveString.equals(s)){
			System.out.println("����.");
		}
		else{
			System.out.println("�ٸ���");
		}
	
		String s7="�����ø���, ��������οø���"; 
		
		System.out.println(s3+", "+s4+"�� �� ������ ��? "+s3.equals(s4)); // true
		String s5="ABC", s6="abc";
		System.out.println(s5+", "+s6+"�� �� ������ ��? "+s5.equals(s6)); // false
		System.out.println(s5+", "+s6+"�� �� ������ ��? (��ҹ��� ����): "+s5.equalsIgnoreCase(s6)); // true	 
		System.out.println("'"+s7+"'���� '��'�� ���� ��ġ��="+s7.indexOf('��')); // 2
		System.out.println("'"+s7+"'���� \"�ø���\"�� ���۵Ǵ� ���� ��ġ="+s7.indexOf("�ø���")); // 2
		System.out.println("'"+s7+"'�� 3��° ���� ��ġ���� \"�ø���\"�� ���۵Ǵ� ���� ��ġ="+s7.indexOf("�ø���",3)); // 12
		String s8="";
		System.out.println("s8�� null�ΰ�? "+s8.isEmpty()); // 
		System.out.println("s7�� null�ΰ�? "+s7.isEmpty()); // 
		System.out.println("'"+s7+"'���� '��'�� ���������� �߰ߵǴ� ���� ��ġ="+s7.lastIndexOf('��')); // 12
		System.out.println("'"+s7+"'���� \"�ø���\"�� ���������� �߰ߵǴ� ���� ��ġ="+s7.lastIndexOf("�ø���")); // 12
		String s9="Nice to meet you. I am on Boeing-747"; 
		
		// ����ǥ����(regular expression)
		// ^ => ���ڿ��� ����
		// $ => ���ڿ��� ������
		// . => ������ ���� �ϳ�
		// ? => ���� ȸ�� 0�� Ȥ�� 1��
		// + => ���� ȸ�� 1�� �̻�
		// * => ���� ȸ�� 0�� �̻�
		// \d => 0~9������ ���� �� �ϳ�
		// \w => 0~9, a-z, A-Z, _ ���� �� �ϳ�
		// \d+ => 0~9������ ���� �ϳ� �̻�
		// [a-z] => a���� z������ �ҹ��� �� �ϳ�
		// [A-Z] => A���� Z������ �빮�� �� �ϳ�
		// [0-9] => 0���� 9������ ���� �� �ϳ�. \d�� ����
		// [^a-zA-Z0-9] => ������,���� �̿�(^)�� ���� �ϳ�
		// [^a-zA-Z0-9]+ => ������,���� �̿�(^)�� ���� �ϳ� �̻�
		System.out.println("s9�� Nice�� �����ϴ� ���ڿ��ΰ�? "+s9.matches("^Nice.*$"));
		System.out.println("s9�� �� �߰��� meet�� �����ϴ� ���ڿ��ΰ�? "+s9.matches("^.*meet.*$"));
		System.out.println("s9�� �� �߰��� ���ڰ� �����ϴ� ���ڿ��ΰ�? "+s9.matches("^.*(\\d+).*$")); 
		
		System.out.println(s9.replace("am", "was")); 
		System.out.println(s9.replaceAll("(^| )\\w\\w ", " ++ ")); 
		
		System.out.println("s9�� 'Nice'�� �����ϴ°�? "+s9.startsWith("Nice"));
		System.out.println("s9�� ' Nice'�� �����ϴ°�? "+s9.startsWith(" Nice")); 
		
		char charArrays[]=s9.toCharArray();
		
		for(char c : charArrays){
		 System.out.print(c+"-");
		 }
		 System.out.println();
		 System.out.println("s9�� �빮�ڷ� �ٲٸ�? "+s9.toUpperCase());
		 
		 
		 String s10=" I am hungry. ";
		 
		 System.out.println("s10�� ������ '"+s10+"'");
		 
		// s10.trim(); => ���ڿ� s10�� ���� ���� white space ���ڵ�(���� ' ',�� '\t' ,�ٹٲ޹��ڵ� '\r','\n' ��)�� ������ ���ڿ��� ����
		 System.out.println("s10�� �յ� ���鹮�ڵ��� �����ϸ�? '"+s10.trim()+"'");
		 String s11="���ѹα�";
		 String s12="LOVE";
		 System.out.println("'"+s11+"'�� ���ڰ�����? "+s11.length());
		 System.out.println("'"+s12+"'�� ���ڰ�����? "+s12.length());
		byte s11byteArrays[]=s11.getBytes();
		byte s12byteArrays[]=s12.getBytes();
		 System.out.println("'"+s11+"'�� ����Ʈ������? "+s11byteArrays.length);
		 System.out.println("'"+s12+"'�� ����Ʈ������? "+s12byteArrays.length);
		 System.out.println("'"+s12+"'�� ����Ʈ������? "+s12.getBytes().length); // s12.getBytes()�� s12byteArrays�� ����
		 String s13="2012-05-08";
		 String date[]=s13.split("-");
		 
		for(int i=0; i<date.length; i++){
		 System.out.println(i+"��° �и��� ���ڿ�:"+date[i]);
		 }
		for(String str : date){
		 System.out.println("�и��� ���ڿ�:"+str);
		 }
		for(String str : s13.split("-")){
		 System.out.println("�и��� ���ڿ�:"+str);
		 }
		for(String str : "2012-05-08".split("-")){
		 System.out.println("�и��� ���ڿ�:"+str); 
		 
		// ���ݱ����� String Ŭ������ ��ü�� �ٷ�� �Լ�(�޼ҵ�)���� ���캸�Ҵ�.
		// �ѹ� �ʱ�ȭ�� String ��ü�� �� ���� �ٲ��� �ʴ´�.
		// String s="ABC"; �� ���,
		// s.toLower(); �� �����ϴ��� s�� "abc"�� �ٲ�� ���� �ƴ϶�, ���ο� ���ڿ� "abc"�� ���������.
		// ���� �Ź� ���ο� ���ڿ��� ��������� String ��ü���� �޸� ������ ó�� �ð��� ȿ������ ��������.
		// String�� ����Ͽ� ������ ������ ��Ʈ�� Ŭ������ �ִµ� StringBuilder�� StringBuffer�� �װ��̴�.
		//
		// StringBuilder, StringBuffer�� �Ʒ��� ���� �ݵ�� new�� ���� ��ü�� ������ �ϸ�, String s="ABC"; ó�� ���� ǥ���� ����� �� ����.
		 StringBuilder s14=new StringBuilder("�漺���б�"); // StringBuilder s14="�漺���б�"; => ���Ұ�
		 System.out.println(s14);
		// s14.append("��ǻ�Ͱ��к�"); => s14�� StrinbBuilder�� �ƴ϶� String Ŭ������ ��ü���ٸ� s14.concat("��ǻ�Ͱ��к�");�� ������ �Լ���.
		// ��, String Ŭ������ concat() �Լ��� StringBuilder Ŭ������ append()�� ����
		 s14.append("��ǻ�Ͱ��к�"); // s14�� ������ "�漺���б�"���� "�漺���б���ǻ�Ͱ��к�"�� �����
		 System.out.println(s14);
		// StringBuffer�� ���� StringBuilder�� ���� ���� ������ ���ڿ� ��ü�� �����.
		 StringBuffer s15=new StringBuffer("�漺���б�"); // StringBuffer s15="�漺���б�"; => ���Ұ�
		 System.out.println(s15);
		 s15.append("��ǻ�Ͱ��к�"); // s15�� ������ "�漺���б�"���� "�漺���б���ǻ�Ͱ��к�"�� �����
		 System.out.println(s15);
		// StringBuilder�� StringBuilder�� ����
		// StringBuffer�� ������(thread) ȯ�濡���� ���ڿ� ����� �����ϴ� ����� �߰��Ǿ� ����.
		// ���� ������ ���α׷����� ���� �ʴ´ٸ� StringBuilder�� ����ϴ� ���� �� ȿ������.
		 StringBuilder s16=new StringBuilder("�漺���б���ǻ�Ͱ��к�");
		// s16.charAt(2) => s16 ���ڿ��� 2��° ��ġ ���ڸ� ����
		// s16.charAt(s16.length()-1) => s16 ���ڿ��� ������ ��ġ ���ڸ� ����
		 System.out.println(s16.charAt(2)+","+s16.charAt(s16.length()-1));
		// s16.delete(2,5); => ���ڿ� s16�� 2��° ������ġ���� 5��° ������ġ �ձ��� ���ڵ��� ����
		 s16.delete(2,5);
		 System.out.println("���ڿ� s16�� 2��° ������ġ���� 5��° ������ġ �ձ��� ���ڵ��� ������ ��='"+s16+"'");
		// s16.insert(2, "���п�"); => ���ڿ� s16�� 2��° ������ġ�� ���ڿ� "���п�"�� ����(insert)
		 s16.insert(2, "���п�");
		 System.out.println("���ڿ� s16�� 2��° ������ġ�� ���ڿ� \"���п�\"�� ������ ��='"+s16+"'");
		// s16.reverse(); => ���ڿ� s16 �� ���ڵ��� ��->������� ��->�·� �ٲ۴�. (reverse)
		 s16.reverse();
		 System.out.println("���ڿ� s16 �� ���ڵ��� ��->������� ��->�·� �ٲ� �����='"+s16+"'");
		// s16.subSequence(3, 6) => ���ڿ� s16 �� 3��° ������ġ���� 6��° ������ġ �ձ����� �κй��ڿ��� ����
		// s16�� StringBuilder ��ü�� �ƴ϶� String Ŭ������ ��ü���ٸ� s16.subString(3,6);�� ������ �����.
		 System.out.println("���ڿ� s16 �� 3��° ������ġ���� 6��° ������ġ �ձ����� �κй��ڿ��� �����ϸ�='"+s16.subSequence(3, 6)+"'"); 
		}
	}
}
