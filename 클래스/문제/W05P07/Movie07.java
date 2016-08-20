package 클래스.문제.W05P07;

public class Movie07 {
	
	public String title;
	public String directedBy;
	public int runningTime;
	public String releaseDate;


	public Movie07(String title, String directedBy, int runningTime, Date07 releaseDate) {
		this.title=title;
		this.directedBy=directedBy;
		this.runningTime=runningTime;
		this.releaseDate=releaseDate.toString();
	}


	@Override
	public String toString() {
		return  title + "," + directedBy + "," + runningTime
				+ "," + releaseDate;
	}
	
}
