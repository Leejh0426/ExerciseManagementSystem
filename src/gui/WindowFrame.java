package gui;

import javax.swing.JFrame;

import javax.swing.JPanel;

import manager.ExerciseManager;

public class WindowFrame extends JFrame{
	
	ExerciseManager Exercisemanager;
	MenuSelection menuselection ;
	ExerciseAdder exerciseadder ;
	ExerciseViewer exerciseviewer;
	


	public WindowFrame(ExerciseManager Exercisemanager) {
		this.Exercisemanager = Exercisemanager;
		this.menuselection = new MenuSelection(this);
		this.exerciseadder = new ExerciseAdder(this);
		this.exerciseviewer = new ExerciseViewer(this,this.Exercisemanager);

		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");

		this.setupPanel(menuselection);
		
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

	public ExerciseAdder getExerciseadder() {
		return exerciseadder;
	}

	public void setExerciseadder(ExerciseAdder exerciseadder) {
		this.exerciseadder = exerciseadder;
	}

	public ExerciseViewer getExerciseviewer() {
		return exerciseviewer;
	}

	public void setExerciseviewer(ExerciseViewer exerciseviewer) {
		this.exerciseviewer = exerciseviewer;
	}


}
