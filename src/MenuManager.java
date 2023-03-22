import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		while(num !=6){
	    System.out.println("*** Workout Management System Menu ***");
		System.out.println("1. Add 운동종목");
		System.out.println("2. Delete 운동종목");
		System.out.println("3. Edit 운동종목");
		System.out.println("4. View 운동종목");
		System.out.println("5. Show a menu");
		System.out.println("6. Exit");
		System.out.println("Select one number between");
		num = input.nextInt();
		
		if(num==1) {
			System.out.print("종목이름:");
			String 종목이름 = input.next();
			
			System.out.print("세트수:");
			int Set = input.nextInt();
			
			System.out.print("무게(kg):");
			int Weight = input.nextInt();
			
			System.out.print("쉬는시간(분):");
			int Rest = input.nextInt();
			}
		}
	}
}