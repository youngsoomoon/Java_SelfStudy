package sec06.exam05.package2;

import sec06.exam05.package1.A;

public class C {
	public C() {
		A a = new A();
		a.field1 = 1;   
		//a.field2 = 1;   *default�̱� ������ Ŭ���� C������ ���� ���� ( �ٸ���Ű��, �ٸ� Ŭ����)
		//a.field3 = 1;   *private�̱� ������ Ŭ���� B,C������ ���� ���� ( ������Ű��, �ٸ� Ŭ����)
		
		a.method1();   
		//a.method2();   
		//a.method3();   
	}
}


