import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import exercise.BadmintonExercise;
import exercise.BilliardsExercise;
import exercise.Exercise;
import exercise.ExerciseInput;
import exercise.ExerciseKind;
import exercise.HealthExercise;

public class ExerciseManager {
	ArrayList<ExerciseInput> exercises = new ArrayList<ExerciseInput>();
	Scanner sc;

	public ExerciseManager(Scanner sc) {
		this.sc = sc;
	}


	public void AddExercise() {
		int kind = 0;
		ExerciseInput exerciseinput;
		while (kind != 1 && kind !=2 && kind!=3) {
			try {
				System.out.print("1 for Health ");
				System.out.print("2 for Badminton ");
				System.out.print("3 for Billiards");
				System.out.print(".Select num for Exercise Kind 1,2 and 3:");
				kind = sc.nextInt();
				if(kind == 1) {
					exerciseinput = new HealthExercise(ExerciseKind.Health);
					exerciseinput.getUserInput(sc);
					exercises.add(exerciseinput);
					break;
				}
				else if (kind ==2) {
					exerciseinput = new BadmintonExercise(ExerciseKind.Badminton);
					exerciseinput.getUserInput(sc);
					exercises.add(exerciseinput);
					break;
				}
				else if (kind ==3) {
					exerciseinput = new BilliardsExercise(ExerciseKind.Billiards);
					exerciseinput.getUserInput(sc);
					exercises.add(exerciseinput);
					break;
				}
				else {
					System.out.print("Select num for Exercise Kind between 1,2 and 3:");
				}
			}
			catch(InputMismatchException e){
				System.out.println("Please put an integer between 1 and 5!");
				if(sc.hasNext()) {
					sc.next();
				}
				kind = -1;
			}
		}

	}

	public void DeleteExercise() {
		System.out.print("date");
		String exercisedate = sc.next();
		int index = findIndex(exercisedate);
		removefromExercises(index,exercisedate);

	}

	public int findIndex(String exercisedate) {
		int index = -1;
		for(int i=0; i<exercises.size(); i++) {
			if(exercises.get(i).getDate() == exercisedate) {
				index = i;
				break;
			}
		}
		return index;
	}

	public int removefromExercises(int index, String exercisedate) {
		if (index>= 0) {
			exercises.remove(index);
			System.out.println("the exercise" + exercisedate + "has been deleted");	
			return 1;
		}

		else {
			System.out.println("the exercise has not been registered");
			return -1;
		}
	}

	public void EditExercise() {
		System.out.print("date");
		String exercisedate = sc.next();
		for(int i=0; i<exercises.size(); i++) {
			ExerciseInput exercise = exercises.get(i);

			if (exercise.getDate().equals(exercisedate)) {
				int num = -1;
				while (num != 5) {
					showEditMenu();
					num = sc.nextInt();
					switch(num) {
					case 1:
						exercise.setExerciseDate(sc);
						break;

					case 2:
						exercise.setExerciseTime(sc);
						break;
					case 3:
						exercise.setExerciseWhere(sc);
						break;
					case 4:
						exercise.setExercisePartner(sc);
						break;
					default:
						continue;
					}
				}
				break;
			}
		}
	}



	public void showEditMenu() {
		System.out.println("**Exercise Info Edit Menu **");
		System.out.println("1. Edit date");
		System.out.println("2. Edit time");
		System.out.println("3. Edit where");
		System.out.println("4. Edit partner");
		System.out.println("5. Exit");
		System.out.println("Select one number between 1 - 5");
	}

	public void ViewExercise() {
		System.out.println("# of registered students : " + exercises.size());
		for(int i = 0; i<exercises.size(); i++) {
			exercises.get(i).printInfo();
		}
	}
}
