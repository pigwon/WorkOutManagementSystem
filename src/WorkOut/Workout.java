package WorkOut;

import java.util.Scanner;

public abstract class Workout {
	protected WorkoutKind kind =  WorkoutKind.Chest;
	protected String 종목이름;
	protected int Set;
	protected int Weight;
	protected int Rest;
	String chesttarget;

	public Workout() {}

	public Workout(WorkoutKind kind) {
		this.kind=kind;
	}


	public Workout(String 종목이름, int Set, int Weight, int Rest) {

		this.종목이름 = 종목이름;
		this.Set = Set;
		this.Weight = Weight;
		this.Rest = Rest;
	}
	public Workout(WorkoutKind kind, String 종목이름, int Set, int Weight, int Rest) {
		this.kind = kind;
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

	public abstract void printInfo();

	public abstract void getUserInput(Scanner input);
}
