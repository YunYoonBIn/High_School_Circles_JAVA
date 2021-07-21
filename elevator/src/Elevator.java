import java.awt.Event;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Elevator {

	final int MAX_OCCUPANT = 10;
	final int MAX_WEIGHT = 800;
	
	int checkHuman = 0;
	int totalWeight = 0;

	Human human[] = new Human[10];
	
	
	private static Elevator singleton = new Elevator();
	
	static Elevator getInstance() {
		return singleton;
	}
	private Elevator() {
		init();//전역변수 초기화 메소드
	}
	private void init() {
		//배열을 생성자하여 활성화
		for (int i = 0; i < human.length; i++) {
			human[i] = new Human();
		}
		
	}
	//엘리베이터 정보보기
	void elevatorInfo() {
		System.out.println("현재 엘레베이터 상황입니다.");
		for (int i = 0; i < human.length; i++) {
			System.out.println("탑승자 이름 :" +human[i].getName());
		}
		System.out.println("현제 탑승자 총무게:" + totalWeight);
	}
	
	//사람 탑승하기
	void rideElevator(Human human) {
		
		if (checkHuman > 9) {
			System.out.println("인원이 넘칩니다.");
		}else {
			totalWeight += human.getWeight();
			if (totalWeight > MAX_WEIGHT) {
				System.out.println("탑승자를 몸무게 오바");
				System.out.println("내려 병신아." +human.getName());
				totalWeight -= human.getWeight();
				
			}else {
				this.human[checkHuman] = human;
			    this.human[checkHuman] = human;
			    checkHuman += 1;
		}
	}
}
}
