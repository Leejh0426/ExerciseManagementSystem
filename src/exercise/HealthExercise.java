package exercise;

import java.util.Scanner;

public class HealthExercise extends Exercise implements ExerciseInput{
	
	public HealthExercise(ExerciseKind kind) {
		super(kind);
	}
	

	public void getUserInput(Scanner sc) {
		System.out.print("date");
		String date = sc.next();
		this.setDate(date);
		
		System.out.print("time(miniute)");
		int time = sc.nextInt();
		this.setTime(time);
		
		System.out.print("where");
		String where = sc.next();
		this.setWhere(where);
		
		System.out.print("partner");
		String partner = sc.next();
		this.setPartner(partner);
	}
	
	public void printInfo() {
		System.out.println("kind : "+ kind + " date : " + date + " time : " + time + " where : " + where + " partner : " + partner);
	}
}
