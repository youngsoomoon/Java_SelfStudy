package sec05;

public class Car {
	int speed;
	
	// static void run���� ��ü�� �����Ѵٸ� speed�ʵ尡 �ν��Ͻ��ʵ忡�� �����Ǳ⶧���� ������ �����߻�
	void run () {
		System.out.printf("%d���� �޸��ϴ�.\n",speed);
	}
	
	// main�޼��嵵 static�̱⶧���� Car��ü�� �����Ͽ� �����ؾ��Ѵ�.
	public static void main(String[] args) {
		Car mycar = new Car();
		mycar.speed = 60;
		mycar.run();
	}

}
