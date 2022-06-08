package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import exception.DateFormatException;
import exception.PartnerFormatException;
import exercise.ExerciseInput;
import exercise.ExerciseKind;
import exercise.HealthExercise;
import manager.ExerciseManager;

public class ExerciseAdderListener implements ActionListener {

	JTextField fieldDate;
	JTextField fieldTime;
	JTextField fieldWhere;
	JTextField fieldPartner;
	ExerciseManager Exercisemanager;
	
	public ExerciseAdderListener(JTextField fieldDate, JTextField fieldTime, JTextField fieldWhere,
			JTextField fieldPartner,ExerciseManager Exercisemanager) {
		super();
		this.fieldDate = fieldDate;
		this.fieldTime = fieldTime;
		this.fieldWhere = fieldWhere;
		this.fieldPartner = fieldPartner;
		this.Exercisemanager = Exercisemanager;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {

		ExerciseInput exercise = new HealthExercise(ExerciseKind.Health);
		try {
			exercise.setDate(fieldDate.getText());
			exercise.setTime(Integer.parseInt(fieldTime.getText()));
			exercise.setPartner(fieldPartner.getText());
			exercise.setWhere(fieldWhere.getText());
			Exercisemanager.addExercise(exercise);
			putObject(Exercisemanager, "exercisemanager.ser");
			exercise.printInfo();
		} catch (DateFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (PartnerFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}
	
	public static void putObject(ExerciseManager Exercisemanager, String filename) {

		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(Exercisemanager);
			
			out.close();
			file.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
