
import java.util.ArrayList;
import java.util.Scanner;

import WorkOut.Arm;
import WorkOut.Back;
import WorkOut.Legs;
import WorkOut.Shoulder;
import WorkOut.Workout;
import WorkOut.WorkoutKind;

public class WorkoutManager {
	ArrayList<Workout> workouts = new ArrayList<Workout>();
	Scanner input;

	WorkoutManager(Scanner input) {
		this.input = input;
	}

	public void add운동종목() {
		int kind =0;
		Workout workout;
		while(kind != 1&& kind  !=2 && kind  !=3 && kind  !=4 && kind  !=5) {

			System.out.println("1 for Chest");
			System.out.println("2 for Shoulder");
			System.out.println("3 for Back");
			System.out.println("4 for Arm");
			System.out.println("5 for Legs");
			System.out.println("Select number for Workout kind between 1 ~ 5:");
			kind = input.nextInt();
			if(kind ==1) {
				workout = new Workout(WorkoutKind.Chest);
				workouts.add(workout);
				workout.getUserInput(input);
				break;
			}else if(kind==2) {
				workout = new Shoulder(WorkoutKind.Shoulder);
				workouts.add(workout);
				workout.getUserInput(input);
				break;
			}
			else if(kind==3) {
				workout = new Back(WorkoutKind.Back);
				workouts.add(workout);
				workout.getUserInput(input);
				break;
			}
			else if(kind==4) {
				workout = new Arm(WorkoutKind.Arm);
				workouts.add(workout);
				workout.getUserInput(input);
				break;
			}
			else if(kind==5) {
				workout = new Legs(WorkoutKind.Legs);
				workouts.add(workout);
				workout.getUserInput(input);
				break;

			}else {
				System.out.print("Select Workout Kind:");


			}
		}
	}


	public void delete운동종목() {
		System.out.print("종목이름:");
		String 종목이름 = input.next();
		int index = -1;
		for (int i = 0; i < workouts.size(); i++) {
			if (workouts.get(i).get종목이름(). equals(종목이름)) {
				index = i;
				break;
			}
		}
		if (index >= 0) {
			workouts.remove(index);
			System.out.println("the workout " + 종목이름 + " is deleted");
		} else {
			System.out.println("the workout has not been registered");
			return;
		}
	}

	public void edit운동종목() {
		System.out.print("종목이름:");
		String 종목이름 = input.next();
		for (int i = 0; i < workouts.size(); i++) {
			Workout workout = workouts.get(i);

			if (workout.get종목이름().equals(종목이름)) {
				int num = -1;
				while (num != 5) {
					System.out.println("*** Workout Info Edit Menu ***");
					System.out.println("1. Edit 운동종목");
					System.out.println("2. Edit 세트수");
					System.out.println("3. Edit kg");
					System.out.println("4. Edit Rest");
					System.out.println("5. Exit");
					System.out.print("Select one number between: ");
					num = input.nextInt();
					if (num == 1) {
						System.out.print("종목이름:");

						String 운동종목 = input.next();
						workout.set종목이름(종목이름);

					} else if (num == 2) {
						System.out.print("세트수:");
						int Set = input.nextInt();
						workout.setSet(Set);

					} else if (num == 3) {
						System.out.print("kg:");
						int Weight = input.nextInt();
						workout.setWeight(Weight);


					} else if (num == 4) {
						System.out.print("Rest:");
						int Rest = input.nextInt();
						workout.setRest(Rest);

					} else {
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
}