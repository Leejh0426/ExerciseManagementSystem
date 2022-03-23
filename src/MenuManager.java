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
			
			if(num == 1) {
				AddExercise();
			}
			
			else if(num == 2) {
				DeleteExercise();
			}
			
			else if(num == 3) {
				EditExercise();
			}
			
			else if(num == 4) {
				ViewExercise();
			}
			
			else
				continue;
				
			}
			
	}   														//main }
	
	public static void AddExercise() {
		Scanner sc = new Scanner(System.in);
		System.out.print("date");
		String date = sc.next();
		System.out.print("kind of exercise");
		String kind_of_exercise = sc.next();
		System.out.print("time(miniute)");
		int time = sc.nextInt();
		System.out.print("where");
		String where = sc.next();
		System.out.print("partner");
		String partner = sc.next();
		}
	
	public static void DeleteExercise() {
		Scanner sc = new Scanner(System.in);
		System.out.print("date");
		String date = sc.next();
		}
	
	public static void EditExercise() {
		Scanner sc = new Scanner(System.in);
		System.out.print("date");
		String date = sc.next();
		}
	
	public static void ViewExercise() {
		Scanner sc = new Scanner(System.in);
		System.out.print("date");
		String date = sc.next();
		}
				
}														//class }
	
