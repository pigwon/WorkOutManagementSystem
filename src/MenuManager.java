import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);

		while(num !=6){
			//()안의 조건을 어길 때까지 반복하는 while반복문
			System.out.println("*** Workout Management System Menu ***");
			System.out.println("1. Add 운동종목");
			System.out.println("2. Delete 운동종목");
			System.out.println("3. Edit 운동종목");
			System.out.println("4. View 운동종목");
			System.out.println("5. Show a menu");
			System.out.println("6. Exit");
			System.out.println("Select one number between:");
			num = input.nextInt();

			if(num==1) {
				add운동종목();
			}
			else if(num==2) {
				delete운동종목();
			}
			else if(num==3) {
				edit운동종목();
			}
			else if(num==4) {
				view운동종목();
			}
			else{
				continue;
			}
		}
	}
	public static void add운동종목() {
		Scanner input = new Scanner(System.in);

		System.out.print("종목이름:");
		String 종목이름 = input.next();

		System.out.print("세트수:");
		int Set = input.nextInt();

		System.out.print("무게(kg):");
		int Weight = input.nextInt();

		System.out.print("쉬는시간(분):");
		int Rest = input.nextInt();

	}
	public static void delete운동종목() {
		Scanner input = new Scanner(System.in);
		System.out.print("종목이름:");
		String 종목이름 = input.next();
	}
	public static void edit운동종목() {
		Scanner input = new Scanner(System.in);
		System.out.print("종목이름:");
		String 종목이름 = input.next();
	}
	public static void view운동종목() {
		Scanner input = new Scanner(System.in);
		System.out.print("종목이름:");
		String 종목이름 = input.next();
	}
}

