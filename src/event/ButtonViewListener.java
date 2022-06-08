package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;

import gui.ExerciseViewer;
import gui.WindowFrame;
import manager.ExerciseManager;

public class ButtonViewListener implements ActionListener {

	WindowFrame frame;
	
	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		ExerciseViewer exerciseViewer = frame.getExerciseviewer();
		ExerciseManager Exercisemanager = getObject("exercisemanager.ser"); 
		exerciseViewer.setExercisemanager(Exercisemanager);
		
		frame.getContentPane().removeAll();
		frame.getContentPane().add(exerciseViewer);
		frame.revalidate();
		frame.repaint();
	}

	
	
	public static ExerciseManager getObject(String filename) {
		ExerciseManager Exercisemanager = null;
		
		
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			Exercisemanager = (ExerciseManager)in.readObject();
			
			in.close();
			file.close();
			
			
		} catch (FileNotFoundException e) {
			return Exercisemanager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Exercisemanager;
	}
}
