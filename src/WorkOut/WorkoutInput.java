package WorkOut;

import java.util.Scanner;

public interface WorkoutInput {

	public void getUserInput(Scanner input);
	
	public String get종목이름();

	public void set종목이름(String 종목이름);

	public void setRest(int rest);

	public void setWeight(int weight);

	public void setSet(int set);

	public void printInfo();
	
	public void setWorkout운동종목(Scanner input);
	
	public void setWorkoutSet(Scanner input);
	
	public void setWorkoutWeight(Scanner input);
	
	public void setWorkoutRest(Scanner input);
}
