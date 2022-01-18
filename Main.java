import java.util.Scanner;

//Author Name: Bijan Amirzadehasl
//Date: 1/10/2022
//Program Name: droneControl
//Purpose: Simulation using button, drone movement in x, y,z location

public class Main {

	public static void main(String[] args) {
		
		Amirzadehasl_Drone drone = new Amirzadehasl_Drone();
		
		Scanner input = new Scanner(System.in);
		
		int choice = 0;
		
		while (choice != 8) {
			
			printMenu();
			choice = input.nextInt();
			input.nextLine();
			
			switch(choice) {
			case 1: drone.moveUp(); break;
			case 2: drone.moveDown(); break;
			case 3: drone.moveForward(); break;
			case 4: drone.moveBackward(); break;
			case 5: drone.turnLeft(); break;
			case 6: drone.turnRight(); break;
			case 7: System.out.println(drone.toString()); break;
			
			}
			
		}

	}
	public static void printMenu() {
		System.out.println("Which direction you like to move the drone?");
		System.out.println("1 - Move Up");
		System.out.println("2 - Move Down");
		System.out.println("3 - Move Forward");
		System.out.println("4 - Move Backward");
		System.out.println("5 - Turn Left");
		System.out.println("6 - Turn Right");
		System.out.println("7 - Display Position");
		System.out.println("8 - Exit Naviagation");
	}
}
