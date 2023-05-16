import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import WorkOut.Arm;
import WorkOut.Back;
import WorkOut.Chest;
import WorkOut.Legs;
import WorkOut.Shoulder;
import WorkOut.Workout;
import WorkOut.WorkoutInput;
import WorkOut.WorkoutKind;

public class WorkoutManager {
	ArrayList<WorkoutInput> workouts = new ArrayList<WorkoutInput>();
	Scanner input;

	WorkoutManager(Scanner input) {
		this.input = input;
	}

	public void add운동종목() {
		int kind =0;
		WorkoutInput workoutInput;
		while(kind != 1&& kind  !=2 && kind  !=3 && kind  !=4 && kind  !=5) {
			try {
			System.out.println("1 for Chest");
			System.out.println("2 for Shoulder");
			System.out.println("3 for Back");
			System.out.println("4 for Arm");
			System.out.println("5 for Legs");
			System.out.println("Select number for Workout kind between 1 ~ 5:");
			kind = input.nextInt();
			if(kind ==1) {
				workoutInput = new Chest(WorkoutKind.Chest);
				workouts.add(workoutInput);
				workoutInput.getUserInput(input);
				break;
			}else if(kind==2) {
				workoutInput = new Shoulder(WorkoutKind.Shoulder);
				workouts.add(workoutInput);
				workoutInput.getUserInput(input);
				break;
			}
			else if(kind==3) {
				workoutInput = new Back(WorkoutKind.Back);
				workouts.add(workoutInput);
				workoutInput.getUserInput(input);
				break;
			}
			else if(kind==4) {
				workoutInput = new Arm(WorkoutKind.Arm);
				workouts.add(workoutInput);
				workoutInput.getUserInput(input);
				break;
			}
			else if(kind==5) {
				workoutInput = new Legs(WorkoutKind.Legs);
				workouts.add(workoutInput);
				workoutInput.getUserInput(input);
				break;

			}else {
				System.out.print("Select Workout Kind:");

			}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
				if(input.hasNext()) {
					input.next();
				}
				kind = -1;
			}
		}
	}


	public void delete운동종목() {
		System.out.print("종목이름:");
		String 종목이름 = input.next();
		int index = findIndex(종목이름);
		removefromWorkouts(index,종목이름);
	}

	public int findIndex(String 종목이름) {
		int index = -1;
		for (int i = 0; i < workouts.size(); i++) {
			if (workouts.get(i).get종목이름(). equals(종목이름)) {
				index = i;
				break;
			}
		}
		return index;
	}


	public int removefromWorkouts(int index, String 종목이름) {
		if (index >= 0) {
			workouts.remove(index);
			System.out.println("the workout " + 종목이름 + " is deleted");
			return 1;
		} else {
			System.out.println("the workout has not been registered");
			return -1;
		}

	}

	public void edit운동종목() {
		System.out.print("종목이름:");
		String 종목이름 = input.next();
		for (int i = 0; i < workouts.size(); i++) {
			WorkoutInput workout = workouts.get(i);

			if (workout.get종목이름().equals(종목이름)) {
				int num = -1;
				while (num != 5) {
					showEditMenu();
					num = input.nextInt();
					switch(num) {
					case 1:
						workout.setWorkout운동종목(input);
						break;
					case 2:
						workout.setWorkoutSet(input);
						break;
					case 3:
						workout.setWorkoutWeight(input);
						break;
					case 4:
						workout.setWorkoutRest(input);
						break;
					default:
						continue;
					}
				}
				break;
			}
		}
	}

	public void view운동종목() {
		for (int i = 0; i < workouts.size(); i++) {
			workouts.get(i).printInfo();
		}
	}

	public void showEditMenu() {
		System.out.println("*** Workout Info Edit Menu ***");
		System.out.println("1. Edit 운동종목");
		System.out.println("2. Edit 세트수");
		System.out.println("3. Edit kg");
		System.out.println("4. Edit Rest");
		System.out.println("5. Exit");
		System.out.print("Select one number between: ");

	}
}
