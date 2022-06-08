package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import exercise.ExerciseInput;
import manager.ExerciseManager;

public class ExerciseViewer extends JPanel{

	WindowFrame frame;
	
	ExerciseManager Exercisemanager;
	
	public ExerciseManager getExercisemanager() {
		return Exercisemanager;
	}

	public void setExercisemanager(ExerciseManager exercisemanager) {
		Exercisemanager = exercisemanager;
		this.removeAll();
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Date");
		model.addColumn("Time");
		model.addColumn("Where");
		model.addColumn("Partner");
		
		for(int i=0; i<Exercisemanager.size(); i++) {
			Vector row = new Vector();
			ExerciseInput si = Exercisemanager.get(i);
			row.add(si.getDate());
			row.add(si.getTime());
			row.add(si.getWhere());
			row.add(si.getPartner());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);

		this.add(sp);
	}

	public ExerciseViewer(WindowFrame frame,ExerciseManager Exercisemanager) {
		this.frame = frame;
		this.Exercisemanager = Exercisemanager;
		
		System.out.println("***" + Exercisemanager.size() + "***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Date");
		model.addColumn("Time");
		model.addColumn("Where");
		model.addColumn("Partner");
		
		for(int i=0; i<Exercisemanager.size(); i++) {
			Vector row = new Vector();
			ExerciseInput si = Exercisemanager.get(i);
			row.add(si.getDate());
			row.add(si.getTime());
			row.add(si.getWhere());
			row.add(si.getPartner());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);

		this.add(sp);

	}
}
