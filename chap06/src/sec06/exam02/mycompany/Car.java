package sec06.exam02.mycompany;

import sec06.exam02.hyundai.Engine;
import sec06.exam02.hankook.*;
import sec06.exam02.kumho.*;

public class Car {
	
	//Field
	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	
	// 클래스 이름이 같을경우 클래스의 전체이름을 기술한다.
	sec06.exam02.hankook.Tire tire3 = new sec06.exam02.hankook.Tire();
	sec06.exam02.kumho.Tire tire4 = new sec06.exam02.kumho.Tire();
}
