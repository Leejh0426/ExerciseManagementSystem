package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class ExerciseAdder extends JFrame{
	
	public ExerciseAdder() {
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
		panel.add(labelPartner);
		panel.add(fieldPartner);
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancle"));
		
		SpringUtilities.makeCompactGrid(panel,5,2,6,6,6,6);
		
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(panel);
		this.setVisible(true);
		
	}

}
