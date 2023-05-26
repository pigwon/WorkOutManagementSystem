
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");


	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		WorkoutManager workoutmanager = getObject("workoutmanager.ser");
		if(workoutmanager ==null) {
			workoutmanager =new WorkoutManager(input);
		}
		selectMenu(input,workoutmanager);
		putObject(workoutmanager,"workoutmanager.ser");
	}

	public static void selectMenu(Scanner input,WorkoutManager workoutmanager) {	

		int num = -1;
		while(num !=5){
			try {
				showMenu();
				num = input.nextInt();
				switch(num) {
				case 1: workoutmanager.add운동종목();
				logger.log("운동종목 추가");
				break;
				case 2: workoutmanager.delete운동종목();
				logger.log("운동종목 삭제");
				break;
				case 3: workoutmanager.edit운동종목();
				logger.log("운동종목 편집");
				break;
				case 4: workoutmanager.view운동종목();
				logger.log("운동종목 보기");
				break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
				if(input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
	}

	public static void showMenu() {	
		System.out.println("*** Workout Management System Menu ***");
		System.out.println("1. Add 운동종목");
		System.out.println("2. Delete 운동종목");
		System.out.println("3. Edit 운동종목");
		System.out.println("4. View 운동종목들");
		System.out.println("5. Exit");
		System.out.println("Select one number between:");
	}

	public static WorkoutManager getObject(String filename) {
		WorkoutManager workoutmanager = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);


			workoutmanager = (WorkoutManager)in.readObject();


			in.close();
			file.close();

		} catch (FileNotFoundException e) {
			return workoutmanager;

		} catch (IOException e) {
			e.printStackTrace();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return workoutmanager;
	}

	public static void putObject(WorkoutManager workoutmanager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);


			out.writeObject(workoutmanager);


			out.close();
			file.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}