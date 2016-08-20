package 문자열;

public class String1 {

	public static void main(String[] args) {
		String s="2015642028김지원";
		String saveString = new String("2015642028김지원");
		
		System.out.println(s.charAt(0)+", "+s.charAt(3)+", "+s.charAt(s.length()-1));
		System.out.println(s.concat("가나다"));//만들어진건 새로운 문자열, 바뀐거아님.
		System.out.println(s);
//		s=s.concat("가나다");//이건 바꾼다는게 아니라 새로 만들어서 대체하는것.
//		System.out.println(s);
		System.out.println("s가 '김지원'를 포함하고 있는가? "+s.contains("김지원")); // 실행결과 true
		System.out.println("s가 '강지원'를 포함하고 있는가? "+s.contains("강지원")); // 실행결과 false
		System.out.println("s가 '가나다'로 끝나는가? "+s.endsWith("가나다"));
		
		
		String s3="ABC", s4="ABC"; 
		//객체가 동일한지.
		if(s3.equals(s4)){ 
			System.out.println("s3, s4는 같습니다.");
			 }
			else{
			 System.out.println("s3, s4는 다릅니다.");
			 } 
		//s = ...김지원가나다(concat) / saveString = ....김지원(원본)
		if(saveString.equals(s)){
			System.out.println("같다.");
		}
		else{
			System.out.println("다르다");
		}
		
//		saveString=saveString.concat("가나다");//내용이 같을 때, 동일한 인스턴스를 사용?
		
		if(saveString.equals(s)){
			System.out.println("같다.");
		}
		else{
			System.out.println("다르다");
		}
	
		String s7="런던올림픽, 런던장애인올림픽"; 
		
		System.out.println(s3+", "+s4+"가 그 내용이 같? "+s3.equals(s4)); // true
		String s5="ABC", s6="abc";
		System.out.println(s5+", "+s6+"이 그 내용이 같? "+s5.equals(s6)); // false
		System.out.println(s5+", "+s6+"이 그 내용이 같? (대소문자 무시): "+s5.equalsIgnoreCase(s6)); // true	 
		System.out.println("'"+s7+"'에서 '올'의 문자 위치는="+s7.indexOf('올')); // 2
		System.out.println("'"+s7+"'에서 \"올림픽\"이 시작되는 문자 위치="+s7.indexOf("올림픽")); // 2
		System.out.println("'"+s7+"'의 3번째 문자 위치부터 \"올림픽\"이 시작되는 문자 위치="+s7.indexOf("올림픽",3)); // 12
		String s8="";
		System.out.println("s8이 null인가? "+s8.isEmpty()); // 
		System.out.println("s7이 null인가? "+s7.isEmpty()); // 
		System.out.println("'"+s7+"'에서 '올'이 마지막으로 발견되는 문자 위치="+s7.lastIndexOf('올')); // 12
		System.out.println("'"+s7+"'에서 \"올림픽\"이 마지막으로 발견되는 문자 위치="+s7.lastIndexOf("올림픽")); // 12
		String s9="Nice to meet you. I am on Boeing-747"; 
		
		// 정규표현식(regular expression)
		// ^ => 문자열의 시작
		// $ => 문자열의 마지막
		// . => 임의의 문자 하나
		// ? => 출현 회수 0번 혹은 1번
		// + => 출현 회수 1번 이상
		// * => 출현 회수 0번 이상
		// \d => 0~9까지의 숫자 중 하나
		// \w => 0~9, a-z, A-Z, _ 문자 중 하나
		// \d+ => 0~9까지의 숫자 하나 이상
		// [a-z] => a부터 z까지의 소문자 중 하나
		// [A-Z] => A부터 Z까지의 대문자 중 하나
		// [0-9] => 0부터 9까지의 숫자 중 하나. \d와 동일
		// [^a-zA-Z0-9] => 영문자,숫자 이외(^)의 문자 하나
		// [^a-zA-Z0-9]+ => 영문자,숫자 이외(^)의 문자 하나 이상
		System.out.println("s9가 Nice로 시작하는 문자열인가? "+s9.matches("^Nice.*$"));
		System.out.println("s9가 그 중간에 meet가 출현하는 문자열인가? "+s9.matches("^.*meet.*$"));
		System.out.println("s9가 그 중간에 숫자가 출현하는 문자열인가? "+s9.matches("^.*(\\d+).*$")); 
		
		System.out.println(s9.replace("am", "was")); 
		System.out.println(s9.replaceAll("(^| )\\w\\w ", " ++ ")); 
		
		System.out.println("s9가 'Nice'로 시작하는가? "+s9.startsWith("Nice"));
		System.out.println("s9가 ' Nice'로 시작하는가? "+s9.startsWith(" Nice")); 
		
		char charArrays[]=s9.toCharArray();
		
		for(char c : charArrays){
		 System.out.print(c+"-");
		 }
		 System.out.println();
		 System.out.println("s9를 대문자로 바꾸면? "+s9.toUpperCase());
		 
		 
		 String s10=" I am hungry. ";
		 
		 System.out.println("s10의 내용은 '"+s10+"'");
		 
		// s10.trim(); => 문자열 s10의 앞쪽 뒤쪽 white space 문자들(공백 ' ',탭 '\t' ,줄바꿈문자들 '\r','\n' 등)을 제거한 문자열을 리턴
		 System.out.println("s10의 앞뒤 공백문자들을 제거하면? '"+s10.trim()+"'");
		 String s11="대한민국";
		 String s12="LOVE";
		 System.out.println("'"+s11+"'의 문자개수는? "+s11.length());
		 System.out.println("'"+s12+"'의 문자개수는? "+s12.length());
		byte s11byteArrays[]=s11.getBytes();
		byte s12byteArrays[]=s12.getBytes();
		 System.out.println("'"+s11+"'의 바이트개수는? "+s11byteArrays.length);
		 System.out.println("'"+s12+"'의 바이트개수는? "+s12byteArrays.length);
		 System.out.println("'"+s12+"'의 바이트개수는? "+s12.getBytes().length); // s12.getBytes()는 s12byteArrays와 같다
		 String s13="2012-05-08";
		 String date[]=s13.split("-");
		 
		for(int i=0; i<date.length; i++){
		 System.out.println(i+"번째 분리된 문자열:"+date[i]);
		 }
		for(String str : date){
		 System.out.println("분리된 문자열:"+str);
		 }
		for(String str : s13.split("-")){
		 System.out.println("분리된 문자열:"+str);
		 }
		for(String str : "2012-05-08".split("-")){
		 System.out.println("분리된 문자열:"+str); 
		 
		// 지금까지는 String 클래스의 객체를 다루는 함수(메소드)들을 살펴보았다.
		// 한번 초기화된 String 객체는 그 값이 바뀌지 않는다.
		// String s="ABC"; 인 경우,
		// s.toLower(); 를 수행하더라도 s가 "abc"로 바뀌는 것이 아니라, 새로운 문자열 "abc"가 만들어진다.
		// 따라서 매번 새로운 문자열이 만들어지는 String 객체들은 메모리 공간과 처리 시간을 효율성이 떨어진다.
		// String을 대신하여 변경이 가능한 스트링 클래스가 있는데 StringBuilder와 StringBuffer가 그것이다.
		//
		// StringBuilder, StringBuffer는 아래와 같이 반드시 new를 통해 객체를 만들어야 하며, String s="ABC"; 처럼 간략 표현을 사용할 수 없다.
		 StringBuilder s14=new StringBuilder("경성대학교"); // StringBuilder s14="경성대학교"; => 사용불가
		 System.out.println(s14);
		// s14.append("컴퓨터공학부"); => s14가 StrinbBuilder가 아니라 String 클래스의 객체였다면 s14.concat("컴퓨터공학부");와 동일한 함수임.
		// 즉, String 클래스의 concat() 함수는 StringBuilder 클래스의 append()와 동일
		 s14.append("컴퓨터공학부"); // s14의 내용이 "경성대학교"에서 "경성대학교컴퓨터공학부"로 변경됨
		 System.out.println(s14);
		// StringBuffer도 위의 StringBuilder와 같이 변경 가능한 문자열 객체를 만든다.
		 StringBuffer s15=new StringBuffer("경성대학교"); // StringBuffer s15="경성대학교"; => 사용불가
		 System.out.println(s15);
		 s15.append("컴퓨터공학부"); // s15의 내용이 "경성대학교"에서 "경성대학교컴퓨터공학부"로 변경됨
		 System.out.println(s15);
		// StringBuilder와 StringBuilder의 차이
		// StringBuffer는 스레드(thread) 환경에서의 문자열 사용을 지원하는 기능이 추가되어 있음.
		// 따라서 스레드 프로그래밍을 하지 않는다면 StringBuilder를 사용하는 것이 더 효율적임.
		 StringBuilder s16=new StringBuilder("경성대학교컴퓨터공학부");
		// s16.charAt(2) => s16 문자열의 2번째 위치 문자를 리턴
		// s16.charAt(s16.length()-1) => s16 문자열의 마지막 위치 문자를 리턴
		 System.out.println(s16.charAt(2)+","+s16.charAt(s16.length()-1));
		// s16.delete(2,5); => 문자열 s16의 2번째 문자위치부터 5번째 문자위치 앞까지 문자들을 제거
		 s16.delete(2,5);
		 System.out.println("문자열 s16의 2번째 문자위치부터 5번째 문자위치 앞까지 문자들을 제거한 후='"+s16+"'");
		// s16.insert(2, "대학원"); => 문자열 s16의 2번째 문자위치에 문자열 "대학원"을 삽입(insert)
		 s16.insert(2, "대학원");
		 System.out.println("문자열 s16의 2번째 문자위치에 문자열 \"대학원\"을 삽입한 후='"+s16+"'");
		// s16.reverse(); => 문자열 s16 내 문자들의 좌->우방향을 우->좌로 바꾼다. (reverse)
		 s16.reverse();
		 System.out.println("문자열 s16 내 문자들의 좌->우방향을 우->좌로 바꾼 결과는='"+s16+"'");
		// s16.subSequence(3, 6) => 문자열 s16 내 3번째 문자위치부터 6번째 문자위치 앞까지의 부분문자열을 추출
		// s16이 StringBuilder 객체가 아니라 String 클래스의 객체였다면 s16.subString(3,6);과 동일한 결과임.
		 System.out.println("문자열 s16 내 3번째 문자위치부터 6번째 문자위치 앞까지의 부분문자열을 추출하면='"+s16.subSequence(3, 6)+"'"); 
		}
	}
}
