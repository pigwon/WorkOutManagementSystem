package event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;

import gui.WindowFrame;
import gui.WorkoutViewer;
import manager.WorkoutManager;

public class ButtonViewListener implements ActionListener {

	WindowFrame frame;

	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		WorkoutViewer workoutViewer = frame.getWorkoutviewer();
		WorkoutManager workoutManager = getObject("workoutmanager.ser");
		workoutViewer.setWorkoutmanager(workoutManager);

		frame.getContentPane().removeAll();
		frame.getContentPane().add(workoutViewer);
		frame.revalidate();
		frame.repaint();

		//		JButton b = (JButton) e.getSource();
		//		WorkoutViewer viewer = frame.getWorkoutviewer();
		//		frame.setupPanel(viewer);

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

}
