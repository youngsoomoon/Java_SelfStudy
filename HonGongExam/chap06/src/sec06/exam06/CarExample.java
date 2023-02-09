package sec06.exam06;

public class CarExample {

	public static void main(String[] args) {
		Car mycar = new Car();
		
		//잘못된 속도 변경
		mycar.setSpeed(-60);
		System.out.printf("현재속도 : %d\n", mycar.getSpeed());

		//올바른 속도 변경
		mycar.setSpeed(60);
		
		//멈춤
		if(!mycar.isStop()) {
			mycar.setStop(true);
		}
		
		
		System.out.printf("현재속도 : %d\n", mycar.getSpeed());
		

	}

}
