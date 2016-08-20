package 클래스.문제.W06P02;

public class W06P02 {

	public static void main(String[] args) {
		Volunteer volunteer[]={
				new Doctor("김철수","외과"),
				new Nurse("이영희",7),
				new Doctor("박미경","소아과"),
				new Nurse("최철수",30),
				new Nurse("정동수",10)
				};
		for(Volunteer v: volunteer){
			System.out.print("이름:"+v.name+",");
			if(v instanceof Doctor) System.out.println("전공분야:"+((Doctor)v).specialty);
			if(v instanceof Nurse) System.out.println("경력년수:"+((Nurse)v).careerYear);
				
		}
	}

}
