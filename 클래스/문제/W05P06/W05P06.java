package Ŭ����.����.W05P06;

public class W05P06 {
	public static void main(String[] s){
		Movie06 movies[]=new Movie06[6];
		movies[0]=new Movie06("��Ʈ����","���Ű����",136,"19990331");
		movies[1]=new Movie06("�ƹ�Ÿ","���ӽ� ĳ�ӷ�",161,"20091210");
		movies[2]=new Movie06("�μ���","ũ�������� �",148,"20100708");
		movies[3]=new Movie06("�ҽ��ڵ�","���� ����",93,"20100311");
		movies[4]=new Movie06("13��","������ �罺��",100,"19990416");
		movies[5]=new Movie06(s[0],s[1],Integer.parseInt(s[2]),s[3]);
		printMoiveGuinness(movies);
	}
	static void printMoiveGuinness(Movie06[] movies){
		int lastMonthMoive=0;
		int longTime=0;
		int shortTime=0;
		
		
		for(int i=0,a=0,b=0;i< movies.length;i++){
			a=Integer.parseInt(movies[i].releaseDate.substring(4,8));
			b=Integer.parseInt(movies[lastMonthMoive].releaseDate.substring(4,8));
			if(a > b) lastMonthMoive = i;
			
			if(movies[i].runningTime > movies[longTime].runningTime)
				longTime = i;
			if(movies[i].runningTime < movies[shortTime].runningTime)
				shortTime = i;
		}
		System.out.println("�������İ�����ȭ:"+movies[lastMonthMoive]);
		System.out.println("����ð��󿵿�ȭ:"+movies[longTime]);
		System.out.println("�ּҽð��󿵿�ȭ:"+movies[shortTime]);
		
	}
}
