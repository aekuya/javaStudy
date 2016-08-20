package 클래스.문제.W05P03;

public class Movie03 {
	
	public String title;
	public String directedBy;
	public int runningTime;
	public String releaseDate;
	
	public Movie03(String data) {
		String[] splitData = data.split(":");
		this.title=splitData[0];
		this.directedBy=splitData[1];
		this.runningTime=Integer.parseInt(splitData[2]);
		this.releaseDate=splitData[3];
	}

	@Override
	public String toString() {
		return  title + "," + directedBy + "," + runningTime
				+ "," + releaseDate;
	}
	
}
