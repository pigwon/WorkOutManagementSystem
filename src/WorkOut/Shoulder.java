package WorkOut;

import java.util.Scanner;

public class Shoulder extends Workout implements WorkoutInput {

	private String shouldertarget;

	public Shoulder(WorkoutKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {

		System.out.print("종목이름:");
		String 종목이름 = input.next();
		this.set종목이름(종목이름);

		System.out.print("세트수:");
		int Set = input.nextInt();
		this.setSet(Set);

		System.out.print("무게(kg):");
		int Weight = input.nextInt();
		this.setWeight(Weight);

		System.out.print("쉬는시간(분):");
		int Rest = input.nextInt();
		this.setRest(Rest);

		System.out.print("타켓부위(전면/측면/후면):");
		shouldertarget = input.next();
	}

	public void printInfo() {
		String skind = "none";
		switch(this.kind) {

		case Chest:
			skind = "가슴";
			break;

		case Arm:
			skind = "팔";
			break;

		case Back:
			skind = "등";
			break;

		case Shoulder:
			skind = "어깨";
			break;

		case Legs:
			skind = "다리";
			break;

		default:
		}
		System.out.println("kind:"+ skind +" 종목이름:"+ get종목이름() + " Set:" + getSet() + " Weight:" + getWeight() + " Rest:"+ getRest() + " 타켓부위(전면/측면/후면):" + shouldertarget);
	}


}
