package sec06.exam05.package1;

public class B {
	public B() {
		A a = new A();
		a.field1 = 1;   
		a.field2 = 1;   
		//a.field3 = 1;   *private이기 때문에 클래스 B에서는 접근 제한 ( 같은패키지, 다른 클래스)
		
		a.method1();  
		a.method2();  
		//a.method3();  
	}
}

