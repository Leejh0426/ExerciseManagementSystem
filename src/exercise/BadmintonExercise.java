package exercise;

import java.util.Scanner;

import exception.PartnerFormatException;

public class BadmintonExercise extends Exercise{

	public BadmintonExercise(ExerciseKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner sc) {

		setExerciseDate(sc);
		setExerciseTime(sc);
		setExerciseWhere(sc);


		char answer ='x';
		while(answer != 'y' && answer != 'Y'&&answer != 'n' && answer != 'N') {

			System.out.print("Do you have an partner ? y/n");
			answer = sc.next().charAt(0);
			try {
				if(answer == 'y' || answer == 'Y') {
					setExercisePartner(sc);
					break;
				}
				else if(answer =='n' || answer == 'N') {
					this.setPartner("");
					break;
				}
				else {

				}
			}
			catch(PartnerFormatException e) {
				System.out.println("Incorrect Partner name Format. Put the partner First and Last names");
			}
		}
	}

	public void printInfo() {
		System.out.println("kind : "+ kind + " date : " + date + " time : " + time + " where : " + where + " partner : " + partner);
	}

}
