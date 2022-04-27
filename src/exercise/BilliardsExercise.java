package exercise;

import java.util.Scanner;

public class BilliardsExercise extends Exercise{
	
	public void getUserInput(Scanner sc) {
		System.out.print("date");
		String date = sc.next();
		this.setDate(date);

		System.out.print("time(miniute)");
		int time = sc.nextInt();
		this.setTime(time);
		
		char answer ='x';
		
		while(answer != 'y' && answer != 'Y'&&answer != 'n' && answer != 'N') {
			System.out.print("´Ã °¡´ø°÷ ? y/n");
			answer = sc.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				String where = "¸á·Ð´ç±¸Àå";
				this.setWhere(where);
				break;
			}
			else if(answer =='n' || answer == 'N') {
				this.setWhere("");
				break;
			}
			else {

			}
		}

		System.out.print("partner");
		String partner = sc.next();
		this.setPartner(partner);
	}
}
