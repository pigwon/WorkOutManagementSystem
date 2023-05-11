import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		WorkoutManager workoutmanager = new WorkoutManager(input);

		int num = -1;
		while(num !=5){
			//()안의 조건을 어길 때까지 반복하는 while반복문
			System.out.println("*** Workout Management System Menu ***");
			System.out.println("1. Add 운동종목");
			System.out.println("2. Delete 운동종목");
			System.out.println("3. Edit 운동종목");
			System.out.println("4. View 운동종목들");
			System.out.println("5. Exit");
			System.out.println("Select one number between:");
			num = input.nextInt();

			if(num==1) {
				workoutmanager.add운동종목();
			}
			else if(num==2) {
				workoutmanager.delete운동종목();
			}
			else if(num==3) {
				workoutmanager.edit운동종목();
			}
			else if(num==4) {
				workoutmanager.view운동종목();
			}
			else{
				continue;
			}
		}
	}
}