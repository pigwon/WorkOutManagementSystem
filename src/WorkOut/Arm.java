package WorkOut;

import java.util.Scanner;

public class Arm extends Workout {

	private String armtarget;

	public Arm(WorkoutKind kind) {
		super(kind);
	}


	public void getUserInput(Scanner input) {

		setWorkout운동종목(input);
		setWorkoutSet(input);
		setWorkoutWeight(input);
		setWorkoutRest(input);

		System.out.print("타켓부위(이두/삼두):");
		armtarget = input.next();
	}

	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind:"+ skind +" 종목이름:"+ get종목이름() + " Set:" + getSet() + " Weight:" + getWeight() + " Rest:"+ getRest() + " 타켓부위(이두/삼두):" + armtarget);
	}

}