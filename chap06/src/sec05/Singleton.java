package sec05;

// 단 하나의 객체만 만들도록 보장하는것 : 싱글톤(Singleton)
public class Singleton {

		private static Singleton singleton = new Singleton();
		
		private Singleton() {}
		
		static Singleton getInstance() {
			return singleton;
	}
}
