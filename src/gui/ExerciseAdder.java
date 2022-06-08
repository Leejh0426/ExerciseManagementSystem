package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import event.ExerciseAddCancelListener;
import event.ExerciseAdderListener;
import manager.ExerciseManager;

public class ExerciseAdder extends JPanel{
	
	WindowFrame frame;
	
	ExerciseManager Exercisemanager;
	
	public ExerciseAdder(WindowFrame frame,ExerciseManager Exercisemanager) {
		this.frame = frame;
		this.Exercisemanager = Exercisemanager;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelDate = new JLabel("Date : ", JLabel.TRAILING);
		JTextField fieldDate = new JTextField(10);
		labelDate.setLabelFor(fieldDate);
		panel.add(labelDate);
		panel.add(fieldDate);
		
		JLabel lableTime = new JLabel("Time : ", JLabel.TRAILING);
		JTextField fieldTime = new JTextField(10);
		lableTime.setLabelFor(fieldTime);
		panel.add(lableTime);
		panel.add(fieldTime);
		
		JLabel labelWhere = new JLabel("Where : ", JLabel.TRAILING);
		JTextField fieldWhere = new JTextField(10);
		labelWhere.setLabelFor(fieldWhere);
		panel.add(labelWhere);
		panel.add(fieldWhere);
		
		JLabel labelPartner = new JLabel("Partner : ", JLabel.TRAILING);
		JTextField fieldPartner = new JTextField(10);
		labelPartner.setLabelFor(fieldPartner);
		
		JButton saveButton = new JButton("save");
		saveButton.addActionListener(new ExerciseAdderListener(fieldDate,fieldTime,fieldWhere,fieldPartner,Exercisemanager));
		
		JButton cancelButton = new JButton("cancle");
		cancelButton.addActionListener(new ExerciseAddCancelListener(frame));
		
		panel.add(labelPartner);
		panel.add(fieldPartner);
		
		panel.add(saveButton);
		panel.add(cancelButton);
		
		SpringUtilities.makeCompactGrid(panel,5,2,6,6,6,6);
		

		this.add(panel);
		this.setVisible(true);
		
	}

}
