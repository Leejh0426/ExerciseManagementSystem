package exercise;

import java.util.Scanner;

public class BadmintonExercise extends Exercise {
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

		char answer ='x';
		while(answer != 'y' && answer != 'Y'&&answer != 'n' && answer != 'N') {

			System.out.print("Do you have an partner ? y/n");
			answer = sc.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				System.out.print("partner");
				String partner = sc.next();
				this.setPartner(partner);
				break;
			}
			else if(answer =='n' || answer == 'N') {
				this.setPartner("");
				break;
			}
			else {

			}
		}
	}
}
