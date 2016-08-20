package 클래스.문제.W05P06;

public class Movie06 {
	
	public String title;
	public String directedBy;
	public int runningTime;
	public String releaseDate;
	
	public Movie06(String title, String directedBy, int runningTime
			, String releaseDate) {
		this.title=title;
		this.directedBy=directedBy;
		this.runningTime=runningTime;
		this.releaseDate=releaseDate;
	}

	@Override
	public String toString() {
		return  title + "," + directedBy + "," + runningTime
				+ "," + releaseDate;
	}
	
}
