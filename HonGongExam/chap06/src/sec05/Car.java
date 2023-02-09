package sec05;

public class Car {
	int speed;
	
	// static void run으로 객체를 생성한다면 speed필드가 인스턴스필드에서 생성되기때문에 컴파일 오류발생
	void run () {
		System.out.printf("%d으로 달립니다.\n",speed);
	}
	
	// main메서드도 static이기때문에 Car객체를 생성하여 접근해야한다.
	public static void main(String[] args) {
		Car mycar = new Car();
		mycar.speed = 60;
		mycar.run();
	}

}
