import java.util.ArrayList;
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
	}

	public void DeleteExercise() {
		System.out.print("date");
		String exercisedate = sc.next();
		int index = -1;
		for(int i=0; i<exercises.size(); i++) {
			if(exercises.get(i).getDate() == exercisedate) {
				index = i;
				break;
			}
		}

		if (index>= 0) {
			exercises.remove(index);
			System.out.println("the exercise" + exercisedate + "has been deleted");	
		}

		else {
			System.out.println("the exercise has not been registered");
			return;
		}
	}

	public void EditExercise() {
		System.out.print("date");
		String exercisedate = sc.next();
		for(int i=0; i<exercises.size(); i++) {
			ExerciseInput exerciseinput = exercises.get(i);

			if (exerciseinput.getDate().equals(exercisedate)) {
				int num = -1;
				while (num != 5) {
					System.out.println("**Exercise Info Edit Menu **");
					System.out.println("1. Edit date");
					System.out.println("2. Edit time");
					System.out.println("3. Edit where");
					System.out.println("4. Edit partner");
					System.out.println("5. Exit");
					System.out.println("Select one number between 1 - 5");
					num = sc.nextInt();
					if(num == 1) {
						System.out.print("Exercise date");
						String date = sc.next();
						exerciseinput.setDate(date);
					}


					else if(num == 2) {
						System.out.print("time(miniute)");
						int time = sc.nextInt();
						exerciseinput.setTime(time);
					}

					else if(num == 3) {
						System.out.print("where");
						String where = sc.next();
						exerciseinput.setWhere(where);
					}

					else if(num ==4) {
						System.out.print("partner");
						String partner = sc.next();
						exerciseinput.setPartner(partner);
					}

					else
						continue;
				}
				break;
			}
		}
	}
	public void ViewExercise() {
		//		System.out.print("date");
		//		String exercisedate = sc.next();
		System.out.println("#  of registered students: " + exercises.size());
		for(int i=0; i<exercises.size(); i++) {
			exercises.get(i).printInfo();
		}
	}
}
