package sec06.exam06;

public class CarExample {

	public static void main(String[] args) {
		Car mycar = new Car();
		
		//�߸��� �ӵ� ����
		mycar.setSpeed(-60);
		System.out.printf("����ӵ� : %d\n", mycar.getSpeed());

		//�ùٸ� �ӵ� ����
		mycar.setSpeed(60);
		
		//����
		if(!mycar.isStop()) {
			mycar.setStop(true);
		}
		
		
		System.out.printf("����ӵ� : %d\n", mycar.getSpeed());
		

	}

}
