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
		init();//�������� �ʱ�ȭ �޼ҵ�
	}
	private void init() {
		//�迭�� �������Ͽ� Ȱ��ȭ
		for (int i = 0; i < human.length; i++) {
			human[i] = new Human();
		}
		
	}
	//���������� ��������
	void elevatorInfo() {
		System.out.println("���� ���������� ��Ȳ�Դϴ�.");
		for (int i = 0; i < human.length; i++) {
			System.out.println("ž���� �̸� :" +human[i].getName());
		}
		System.out.println("���� ž���� �ѹ���:" + totalWeight);
	}
	
	//��� ž���ϱ�
	void rideElevator(Human human) {
		
		if (checkHuman > 9) {
			System.out.println("�ο��� ��Ĩ�ϴ�.");
		}else {
			totalWeight += human.getWeight();
			if (totalWeight > MAX_WEIGHT) {
				System.out.println("ž���ڸ� ������ ����");
				System.out.println("���� ���ž�." +human.getName());
				totalWeight -= human.getWeight();
				
			}else {
				this.human[checkHuman] = human;
			    this.human[checkHuman] = human;
			    checkHuman += 1;
		}
	}
}
}
