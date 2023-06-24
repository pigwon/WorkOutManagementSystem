package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import WorkOut.Arm;
import WorkOut.Chest;
import WorkOut.Workout;
import WorkOut.WorkoutInput;
import WorkOut.WorkoutKind;
import manager.WorkoutManager;

public class WorkoutAdderListenter implements ActionListener {

	JTextField field종목이름;
	JTextField fieldset;
	JTextField fieldweight;
	JTextField fieldrest;
	WorkoutManager workoutmanager;

	public WorkoutAdderListenter(
			JTextField field종목이름,
			JTextField fieldset,
			JTextField fieldweight,
			JTextField fieldrest,
			WorkoutManager workoutmanager
			) {

		this.field종목이름 = field종목이름;
		this.fieldset = fieldset;
		this.fieldweight = fieldweight;
		this.fieldrest = fieldrest;
		this.workoutmanager = workoutmanager;
	}


	@Override
	public void actionPerformed(ActionEvent e) {

		WorkoutInput workout =new Arm(WorkoutKind.Arm);
		workout.set종목이름(field종목이름.getText());
		workout.setSet(Integer.parseInt(fieldset.getText()));
		workout.setWeight(Integer.parseInt(fieldweight.getText()));
		workout.setRest(Integer.parseInt(fieldrest.getText()));
		workoutmanager.add운동종목(workout);
		putObject(workoutmanager,"workoutmanager.ser");
		workout.printInfo();

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
