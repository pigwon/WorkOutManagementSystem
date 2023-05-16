package WorkOut;

import java.util.Scanner;

public class Chest extends Workout {
	private String Chesttarget;

	public Chest(WorkoutKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {

		setWorkout운동종목(input);
		setWorkoutSet(input);
		setWorkoutWeight(input);
		setWorkoutRest(input);

		System.out.print("타켓부위(위/중간/아래):");
		Chesttarget = input.next();
	}

	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind:"+ skind +" 종목이름:"+ get종목이름() + " Set:" + getSet() + " Weight:" + getWeight() + " Rest:"+ getRest() + " 타켓부위(위/중간/아래):" + Chesttarget);
	}

}

