package sec05;

// �� �ϳ��� ��ü�� ���鵵�� �����ϴ°� : �̱���(Singleton)
public class Singleton {

		private static Singleton singleton = new Singleton();
		
		private Singleton() {}
		
		static Singleton getInstance() {
			return singleton;
	}
}
