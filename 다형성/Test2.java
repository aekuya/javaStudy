package ������;

public class Test2 {

	public static void main(String[] args) {
		
		Animal animal=new Animal("��ü�Ҹ��ǵ���");
		System.out.println(animal+":"+animal.speak());
		PetDog petDog=new PetDog("�ٵ���");
		System.out.println(petDog+":"+petDog.speak());
		
		animal=petDog; // (1)
		System.out.println(animal+":"+animal.speak());
		Animal animal2=new PetCat("�޸�"); // (2)
		System.out.println(animal2+":"+animal2.speak());
		Animal animalArray[]={ new PetDog("�ٵ���","�λ�"), new PetCat("�޸�","����"), new PetPig("����","����") };
		
		for (Animal a : animalArray) {
			System.out.println(a+":"+a.speak());
			
			//instanceof , a�� PetDog�� ���Ҽ�������True
			if(a instanceof PetDog){ 
				// ������ ����(�θ�Ŭ��������) a�� ���� � ��ü(�ڽ�Ŭ������ü)�� ����Ű�� �ִ����� �˻��Ѵ�.
				PetDog pD=(PetDog) a; // (3)
				System.out.println("address:"+pD.address); // (4)
			}
		
			if(a instanceof PetCat) System.out.println("address:"+((PetCat) a).address);
			if(a instanceof PetPig) System.out.println("address:"+((PetPig) a).address);
			
		}
		//��...
		//��� ���� ��������, USB�� Tv,��ǻ�� ȣȯ�Ǵ� �����? ������ ����°� ����� �ʹ�.
		//��¦ �򰥸�������ϴ�
		
	}	
	
}
	
