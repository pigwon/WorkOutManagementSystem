import java.util.ArrayList;
import java.util.Scanner;

public class WorkoutManager {
    ArrayList<Workout> workouts = new ArrayList<Workout>();
    Scanner input;

    WorkoutManager(Scanner input) {
        this.input = input;
    }

    public void add운동종목() {
        Workout workout = new Workout();

        System.out.print("종목이름:");
        workout.종목이름 = input.next();

        System.out.print("세트수:");
        workout.Set = input.nextInt();

        System.out.print("무게(kg):");
        workout.Weight = input.nextInt();

        System.out.print("쉬는시간(분):");
        workout.Rest = input.nextInt();
        workouts.add(workout);
    }

    public void delete운동종목() {
        System.out.print("종목이름:");
        String 종목이름 = input.next();
        int index = -1;
        for (int i = 0; i < workouts.size(); i++) {
            if (workouts.get(i).종목이름.equals(종목이름)) {
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

            if (workout.종목이름.equals(종목이름)) {
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
                        workout.종목이름 = input.next();
                    } else if (num == 2) {
                        System.out.print("세트수:");
                        workout.Set = input.nextInt();
                    } else if (num == 3) {
                        System.out.print("kg:");
                        workout.Weight = input.nextInt();
                    } else if (num == 4) {
                        System.out.print("Rest:");
                        workout.Rest = input.nextInt();
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
