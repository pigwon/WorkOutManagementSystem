package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class WorkoutViewer extends JFrame{

	public WorkoutViewer() {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("운동종목");
		model.addColumn("Set");
		model.addColumn("Weight");
		model.addColumn("Rest");
		
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		
		this.add(sp);
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
