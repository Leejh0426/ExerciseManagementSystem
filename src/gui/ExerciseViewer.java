package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ExerciseViewer extends JFrame{

	public ExerciseViewer() {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Date");
		model.addColumn("Time");
		model.addColumn("Where");
		model.addColumn("Partner");
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);

		this.add(sp);
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
