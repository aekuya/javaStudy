package 클래스.문제.W05P07;

public class W05P07 {

	public static void main(String[] args) {
		Date07 releaseDate=new Date07();
		releaseDate.year=1999;
		releaseDate.month=3;
		releaseDate.day=31;
		Movie07 movie=new Movie07("매트릭스","워쇼스키형제",136,releaseDate);
		System.out.println(movie);
	}

}
