package event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.WindowFrame;
import gui.WorkoutAdder;
import gui.WorkoutViewer;

public class ButtonAddListener implements ActionListener {

	WindowFrame frame;

	public ButtonAddListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getWorkoutadder());
		frame.revalidate();
		frame.repaint();
//		JButton b = (JButton) e.getSource();
//		WorkoutAdder adder = frame.getWorkoutadder();
//
//		frame.setupPanel(adder);
	}

}
