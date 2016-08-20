package Å¬·¡½º.¹®Á¦.W05P10;

public class W05P10 {

	public static void main(String[] args) {
		JobApplicant applicant1 = new JobApplicant(95, "±èÃ¶¼ö",'³²',"cskim@ks.ac.kr");
		JobApplicant applicant2 = new JobApplicant(96, "¹ÚÃ¶¼ö",'³²',"cspark@ks.ac.kr");
		applicant1.setScore(70);
		applicant2.setScore(69);
		System.out.println(applicant1);
		System.out.println(applicant2);
	}

}
