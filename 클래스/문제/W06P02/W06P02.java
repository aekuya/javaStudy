package Ŭ����.����.W06P02;

public class W06P02 {

	public static void main(String[] args) {
		Volunteer volunteer[]={
				new Doctor("��ö��","�ܰ�"),
				new Nurse("�̿���",7),
				new Doctor("�ڹ̰�","�Ҿư�"),
				new Nurse("��ö��",30),
				new Nurse("������",10)
				};
		for(Volunteer v: volunteer){
			System.out.print("�̸�:"+v.name+",");
			if(v instanceof Doctor) System.out.println("�����о�:"+((Doctor)v).specialty);
			if(v instanceof Nurse) System.out.println("��³��:"+((Nurse)v).careerYear);
				
		}
	}

}
