import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ExerciseManager Exercisemanager = new ExerciseManager(sc);
		int num = -1;

		while (num != 5) {
			System.out.println("1. Add Exercises");
			System.out.println("2. Delete Exercises");
			System.out.println("3. Edit Exercises");
			System.out.println("4. View Exercises");
			System.out.println("5. Exit");
			
			num = sc.nextInt();
			
			if(num == 1) {
				Exercisemanager.AddExercise();
			}
			
			else if(num == 2) {
				Exercisemanager.DeleteExercise();
			}
			
			else if(num == 3) {
				Exercisemanager.EditExercise();
			}
			
			else if(num == 4) {
				Exercisemanager.ViewExercise();
			}
			
			else
				continue;
				
			}
			
	}   														//main }

				
}														//class }
	
