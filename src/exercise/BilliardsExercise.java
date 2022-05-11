package exercise;

import java.util.Scanner;

public class BilliardsExercise extends Exercise{
	
	protected String where = "¸á·Ð´ç±¸Àå";
	
	public BilliardsExercise(ExerciseKind kind) {
		super(kind);
	}
	
	
	public void getUserInput(Scanner sc) {

		setExerciseDate(sc);

		setExerciseTime(sc);
		
		char answer ='x';
		
		while(answer != 'y' && answer != 'Y'&&answer != 'n' && answer != 'N') {
			System.out.print("´Ã °¡´ø°÷ ? y/n");
			answer = sc.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				break;
			}
			else if(answer =='n' || answer == 'N') {
				setExerciseWhere(sc);
				break;
			}
			else {

			}
		}

		setExercisePartner(sc);
	}
	
	public void printInfo() {
		System.out.println("kind : "+ kind + " date : " + date + " time : " + time + " where : " + where + " partner : " + partner);
	}
	
	public void setWhere(String where) {
		this.where = where;
	}
}
