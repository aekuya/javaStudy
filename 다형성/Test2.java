package 다형성;

public class Test2 {

	public static void main(String[] args) {
		
		Animal animal=new Animal("정체불명의동물");
		System.out.println(animal+":"+animal.speak());
		PetDog petDog=new PetDog("바둑이");
		System.out.println(petDog+":"+petDog.speak());
		
		animal=petDog; // (1)
		System.out.println(animal+":"+animal.speak());
		Animal animal2=new PetCat("메리"); // (2)
		System.out.println(animal2+":"+animal2.speak());
		Animal animalArray[]={ new PetDog("바둑이","부산"), new PetCat("메리","마산"), new PetPig("해피","기장") };
		
		for (Animal a : animalArray) {
			System.out.println(a+":"+a.speak());
			
			//instanceof , a가 PetDog로 변할수있으면True
			if(a instanceof PetDog){ 
				// 다형성 변수(부모클래스변수) a가 현재 어떤 객체(자식클래스객체)를 가리키고 있는지를 검사한다.
				PetDog pD=(PetDog) a; // (3)
				System.out.println("address:"+pD.address); // (4)
			}
		
			if(a instanceof PetCat) System.out.println("address:"+((PetCat) a).address);
			if(a instanceof PetPig) System.out.println("address:"+((PetPig) a).address);
			
		}
		//음...
		//사실 동물 예제보단, USB나 Tv,컴퓨터 호환되는 어댑터? 같은걸 만드는건 어땠을까 싶다.
		//살짝 헷갈리기시작하는
		
	}	
	
}
	
