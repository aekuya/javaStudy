package Ŭ����.����.W05P04;

public class Movie04 {
	
	public String title;
	public String directedBy;
	public int runningTime;
	public String releaseDate;
	
	public Movie04(String title, String directedBy, int runningTime
			, String releaseDate) {
		this.title=title;
		this.directedBy=directedBy;
		this.runningTime=runningTime;
		this.releaseDate=releaseDate;
	}

	@Override
	public String toString() {
		String date[]= new String[3];
		date[0]=releaseDate.substring(0,4);
		date[1]=releaseDate.substring(4,6);
		date[2]=releaseDate.substring(6,8);
		
		int hour = (int) runningTime/60;
		int min = runningTime%60;
		
		return "���� :" + title +"\n���� :"+directedBy+"\n�󿵽ð� :"+
				hour + "�ð�" + min + "��\n" +"������ : "+date[0]+"��"+
				date[1]+"��"+date[2]+"��";
	}
	
}
