package exercise;

import java.util.Scanner;

public class HealthExercise extends Exercise{
	
	public HealthExercise(ExerciseKind kind) {
		super(kind);
	}
	

	public void getUserInput(Scanner sc) {
		setExerciseDate(sc);
		setExerciseTime(sc);
		setExerciseWhere(sc);
		setExercisePartner(sc);
	}
	
	public void printInfo() {
		System.out.println("kind : "+ kind + " date : " + date + " time : " + time + " where : " + where + " partner : " + partner);
	}
}
