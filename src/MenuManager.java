import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		int num = 5;
		Scanner sc = new Scanner(System.in);
		while (num != 6) {
			System.out.println("1. Add Exercises");
			System.out.println("2. Delete Exercises");
			System.out.println("3. Edit Exercises");
			System.out.println("4. View Exercises");
			System.out.println("5. Show a Menu");
			System.out.println("6. Exit");
			
			num = sc.nextInt();
			
			switch(num) {
				case 1 : 
					System.out.print("date");
					String date = sc.next();
					System.out.print("kind of exercise");
					String kindofexercise = sc.next();
					System.out.print("time(miniute)");
					int time = sc.nextInt();
					System.out.print("where");
					String where = sc.next();
					System.out.print("partner");
					String partner = sc.next();
					break;
				case 2 :
					System.out.print("date");
					String date2 = sc.next();
					break;
					
				case 3 :
					System.out.print("date");
					String date3 = sc.next();
					break;
				case 4 :
					System.out.print("date");
					String date4 = sc.next();
					break;
				case 5 : 
					
				case 6 :
				
					
			}
			
		}
	}
}