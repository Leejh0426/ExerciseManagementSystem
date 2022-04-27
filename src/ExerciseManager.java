import java.util.ArrayList;
import java.util.Scanner;

import exercise.BadmintonExercise;
import exercise.BilliardsExercise;
import exercise.Exercise;

public class ExerciseManager {
	ArrayList<Exercise> exercises = new ArrayList<Exercise>();
	Scanner sc;

	public ExerciseManager(Scanner sc) {
		this.sc = sc;
	}


	public void AddExercise() {
		int kind = 0;
		Exercise exercise;
		while (kind != 1 && kind !=2 && kind!=3) {
			System.out.print("1 for others ");
			System.out.print("2 for Badminton ");
			System.out.print("3 for Billiards");
			System.out.print(".Select num for Exercise Kind 1,2 and 3:");
			kind = sc.nextInt();
			if(kind == 1) {
				exercise = new Exercise();
				exercise.getUserInput(sc);
				exercises.add(exercise);
				break;
			}
			else if (kind ==2) {
				exercise = new BadmintonExercise();
				exercise.getUserInput(sc);
				exercises.add(exercise);
				break;
			}
			else if (kind ==3) {
				exercise = new BilliardsExercise();
				exercise.getUserInput(sc);
				exercises.add(exercise);
				break;
			}
			else {
				System.out.print("Select num for Exercise Kind between 1 and 2:");
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
			System.out.println("the exercise" + exercisedate + "has not been deleted");	
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
			Exercise exercise = exercises.get(i);

			if (exercise.getDate().equals(exercisedate)) {
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
						exercise.setDate(date);
					}


					else if(num == 2) {
						System.out.print("time(miniute)");
						int time = sc.nextInt();
						exercise.setTime(time);
					}

					else if(num == 3) {
						System.out.print("where");
						String where = sc.next();
						exercise.setWhere(where);
					}

					else if(num ==4) {
						System.out.print("partner");
						String partner = sc.next();
						exercise.setPartner(exercisedate);
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
