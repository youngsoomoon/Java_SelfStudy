package sec06.exam05.package2;

import sec06.exam05.package1.A;

public class C {
	public C() {
		A a = new A();
		a.field1 = 1;   
		//a.field2 = 1;   *default이기 때문에 클래스 C에서는 접근 제한 ( 다른패키지, 다른 클래스)
		//a.field3 = 1;   *private이기 때문에 클래스 B,C에서는 접근 제한 ( 같은패키지, 다른 클래스)
		
		a.method1();   
		//a.method2();   
		//a.method3();   
	}
}


