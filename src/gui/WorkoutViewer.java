package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import WorkOut.WorkoutInput;
import manager.WorkoutManager;

public class WorkoutViewer extends JPanel{

	WindowFrame frame;

	
	WorkoutManager workoutmanager;
	
	public WorkoutManager getWorkoutmanager() {
		return workoutmanager;
	}

	public void setWorkoutmanager(WorkoutManager workoutmanager) {
		this.workoutmanager = workoutmanager;
		this.removeAll();
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("운동종목");
		model.addColumn("Set");
		model.addColumn("Weight");
		model.addColumn("Rest");
		
		for(int i=0; i<workoutmanager.size(); i++) {
			Vector row = new Vector();
			WorkoutInput wo = workoutmanager.get(i);
			row.add(wo.get종목이름());
			row.add(wo.getSet());
			row.add(wo.getRest());
			row.add(wo.getWeight());
			model.addRow(row);
		}


		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);


		this.add(sp);
		
	}

	public WorkoutViewer(WindowFrame frame,WorkoutManager workoutmanager) {
		this.frame = frame;
		this.workoutmanager = workoutmanager;
		
		System.out.println("***"+ workoutmanager.size()+"***");
		

		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("운동종목");
		model.addColumn("Set");
		model.addColumn("Weight");
		model.addColumn("Rest");
		
		for(int i=0; i<workoutmanager.size(); i++) {
			Vector row = new Vector();
			WorkoutInput wo = workoutmanager.get(i);
			row.add(wo.get종목이름());
			row.add(wo.getSet());
			row.add(wo.getRest());
			row.add(wo.getWeight());
			model.addRow(row);
		}


		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);


		this.add(sp);
	}

}
