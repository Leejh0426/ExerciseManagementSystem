import java.util.Scanner;

public class ExerciseManager {
	Exercise exercise;
	Scanner sc;
	
	public ExerciseManager(Scanner sc) {
		this.sc = sc;
	}
	
	
	public void AddExercise() {
		exercise = new Exercise();
		System.out.print("date");
		exercise.date = sc.next();
		System.out.print("kind of exercise");
		exercise.kind_of_exercise = sc.next();
		System.out.print("time(miniute)");
		exercise.time = sc.nextInt();
		System.out.print("where");
		exercise.where = sc.next();
		System.out.print("partner");
		exercise.partner = sc.next();
		}
	
	public void DeleteExercise() {
		System.out.print("date");
		String exercisedate = sc.next();
		
		if(exercise == null) {
			System.out.println("the exercise has not been deleted");
			return;
		}
		if(exercise.date.equals(exercisedate)) {
			exercise = null;
			System.out.println("the exercise is deleted");
		}
	}
	
	public void EditExercise() {
		System.out.print("date");
		String exercisedate = sc.next();
		if (exercise.date.equals(exercisedate)) {
			System.out.println("the exercise to be edited is " + exercisedate);
		}
	}
	
	public void ViewExercise() {
		System.out.print("date");
		String exercisedate = sc.next();
		if (exercise.date.equals(exercisedate)) {
			exercise.printInfo();
		}
	}
}
