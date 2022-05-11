import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ExerciseManager Exercisemanager = new ExerciseManager(sc);
		selectMenu(sc,Exercisemanager);

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
					break;
				case 2:
					Exercisemanager.DeleteExercise();
					break;
				case 3:
					Exercisemanager.EditExercise();
					break;
				case 4:
					Exercisemanager.ViewExercise();
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

}														//class }

