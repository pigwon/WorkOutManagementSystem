package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import event.WorkoutAdderCancelListener;
import event.WorkoutAdderListenter;
import manager.WorkoutManager;

public class WorkoutAdder extends JPanel{
	
	WindowFrame frame;
	WorkoutManager workoutmanager;
	
	public WorkoutAdder(WindowFrame frame, WorkoutManager workoutmanager) {
		this.frame=frame;
		this.workoutmanager=workoutmanager;
		
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());

		JLabel label종목이름 = new JLabel("종목이름",JLabel.TRAILING);
		JTextField field종목이름 = new JTextField(10);
		label종목이름.setLabelFor(field종목이름);
		panel.add(label종목이름);
		panel.add(field종목이름);

		JLabel labelset = new JLabel("Set",JLabel.TRAILING);
		JTextField fieldset = new JTextField(10);
		labelset.setLabelFor(fieldset);
		panel.add(labelset);
		panel.add(fieldset);

		JLabel labelweight = new JLabel("Weight",JLabel.TRAILING);
		JTextField fieldweight = new JTextField(10);
		labelweight.setLabelFor(fieldweight);
		panel.add(labelweight);
		panel.add(fieldweight);

		JLabel labelrest = new JLabel("Rest",JLabel.TRAILING);
		JTextField fieldrest = new JTextField(10);
		labelrest.setLabelFor(fieldrest);
		
		JButton saveButton = new JButton("save");
		saveButton.addActionListener(new WorkoutAdderListenter(field종목이름, fieldset, fieldweight, fieldrest,workoutmanager));
		
		
		JButton cancelButton = new JButton("cancel");
		cancelButton.addActionListener(new WorkoutAdderCancelListener(frame));
		
		
		panel.add(labelrest);
		panel.add(fieldrest);

		panel.add(saveButton);
		panel.add(cancelButton);


		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		
		this.add(panel);
		this.setVisible(true);
	}
}
