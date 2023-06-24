package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.WorkoutManager;

public class WindowFrame extends JFrame{

	WorkoutManager workoutmanager;

	MenuSelection menuselection ;
	WorkoutAdder workoutadder ;
	WorkoutViewer workoutviewer ;


	public WindowFrame(WorkoutManager workoutmanager) {
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");

		this.workoutmanager = workoutmanager;
		this.menuselection = new MenuSelection(this);
		this.workoutadder = new WorkoutAdder(this, this.workoutmanager);
		this.workoutviewer = new WorkoutViewer(this, this.workoutmanager);

		this.add(menuselection); 

		this.setVisible(true);

	}

	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}

	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public WorkoutAdder getWorkoutadder() {
		return workoutadder;
	}

	public void setWorkoutadder(WorkoutAdder workoutadder) {
		this.workoutadder = workoutadder;
	}

	public WorkoutViewer getWorkoutviewer() {
		return workoutviewer;
	}

	public void setWorkoutviewer(WorkoutViewer workoutviewer) {
		this.workoutviewer = workoutviewer;
	}

}

