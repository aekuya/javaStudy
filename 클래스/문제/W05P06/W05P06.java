package 클래스.문제.W05P06;

public class W05P06 {
	public static void main(String[] s){
		Movie06 movies[]=new Movie06[6];
		movies[0]=new Movie06("매트릭스","워쇼스키형제",136,"19990331");
		movies[1]=new Movie06("아바타","제임스 캐머런",161,"20091210");
		movies[2]=new Movie06("인셉션","크리스토퍼 놀런",148,"20100708");
		movies[3]=new Movie06("소스코드","덩컨 존스",93,"20100311");
		movies[4]=new Movie06("13층","조세프 루스넥",100,"19990416");
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
		System.out.println("연중최후개봉영화:"+movies[lastMonthMoive]);
		System.out.println("최장시간상영영화:"+movies[longTime]);
		System.out.println("최소시간상영영화:"+movies[shortTime]);
		
	}
}
