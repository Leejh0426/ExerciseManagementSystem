import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		ExerciseManager Exercisemanager = getObject("studentmanager.ser");
		if(Exercisemanager == null) {
			Exercisemanager = new ExerciseManager(sc);
		}

		
		selectMenu(sc,Exercisemanager);
		putObject(Exercisemanager, "studentmanager.ser");

	} 														//main }

	public static void selectMenu(Scanner sc,ExerciseManager Exercisemanager){
		int num = -1;

		while (num != 5) {
			try {
				showMenu(); 
				num = sc.nextInt();

				switch(num) {
				case 1:
					Exercisemanager.AddExercise();
					logger.log("add a student");
					break;
				case 2:
					Exercisemanager.DeleteExercise();
					logger.log("delete a student");
					break;
				case 3:
					Exercisemanager.EditExercise();
					logger.log("edit a student");
					break;
				case 4:
					Exercisemanager.ViewExercise();
					logger.log("view a student");
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e){
				System.out.println("Please put an integer between 1 and 5!");
				if(sc.hasNext()) {
					sc.next();
				}
				num = -1;
			}

		}

	}

	public static void showMenu() {
		System.out.println("1. Add Exercises");
		System.out.println("2. Delete Exercises");
		System.out.println("3. Edit Exercises");
		System.out.println("4. View Exercises");
		System.out.println("5. Exit");
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
}														//class }

