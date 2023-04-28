package WorkOut;

import java.util.Scanner;

public class Workout {
	protected WorkoutKind kind =  WorkoutKind.Chest;
	protected String 종목이름;
	protected int Set;
	protected int Weight;
	protected int Rest;

	public Workout() {}

	public Workout(String 종목이름, int Set, int Weight, int Rest) {

		this.종목이름 = 종목이름;
		this.Set = Set;
		this.Weight = Weight;
		this.Rest = Rest;
	}

	public WorkoutKind getKind() {
		return kind;
	}

	public void setKind(WorkoutKind kind) {
		this.kind = kind;
	}

	public String get종목이름() {
		return 종목이름;
	}

	public void set종목이름(String 종목이름) {
		this.종목이름 = 종목이름;
	}

	public int getSet() {
		return Set;
	}

	public void setSet(int set) {
		Set = set;
	}

	public int getWeight() {
		return Weight;
	}

	public void setWeight(int weight) {
		Weight = weight;
	}

	public int getRest() {
		return Rest;
	}

	public void setRest(int rest) {
		Rest = rest;
	}

	public void printInfo() {
		System.out.println("종목이름:"+ 종목이름 + "Set:" + Set + "Weight:" + Weight + "Rest:"+ Rest);
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
	}

}
