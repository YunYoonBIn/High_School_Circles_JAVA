
public class Main {

	public static void main(String[] args) {
		Human yun1 = new Human("����1" ,64);
		Human yun2 = new Human("����2" ,64);
		Human yun3 = new Human("����3" ,64);
		Human yun4 = new Human("����4" ,64);
		Human yun5 = new Human("����5" ,64);
		Human yun6 = new Human("����6" ,64);
		Elevator elevator = Elevator.getInstance();

		elevator.elevatorInfo();
	
	    elevator.rideElevator(yun1);
	    elevator.rideElevator(yun2);
	    elevator.rideElevator(yun3);
	    elevator.rideElevator(yun4);
	    elevator.rideElevator(yun5);
	    elevator.elevatorInfo();
	}

}
