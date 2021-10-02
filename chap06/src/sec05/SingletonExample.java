package sec05;

public class SingletonExample {

	public static void main(String[] args) {
		/* 다음과같이 Singleton객체를 두 개의 객체로 생성할 경우 컴파일 에러 발생
		 Singleton obj1 = new Singleton();
		 Singleton obj2 = new Singleton();
		 */
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체입니다.");
		} else {
			System.out.println("다른 Singleton 객체입니다.");
		}
		
		}
	}

