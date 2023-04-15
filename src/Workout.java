
public class Workout {

	String 종목이름;
	int Set;
	int Weight;
	int Rest;
	
	public Workout() {}

	public Workout(String 종목이름, int Set, int Weight, int Rest) {
	
		this.종목이름 = 종목이름;
		this.Set = Set;
		this.Weight = Weight;
		this.Rest = Rest;
	}

	public void printInfo() {
		System.out.println("종목이름:"+ 종목이름 + "Set:" + Set + "Weight:" + Weight + "Rest:"+ Rest);
	}
}
	