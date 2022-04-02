
public class Exercise {
	String date;
	String kind_of_exercise;
	int time;
	String where;
	String partner;
	
	public Exercise() {
		
	}
	
	public Exercise(String date, String kind_of_exercise) {
		this.date = date;
		this.kind_of_exercise = kind_of_exercise;
	}
	
	public Exercise(String date, String kind_of_exercise, int time, String where, String partner) {
		this.date = date;
		this.kind_of_exercise = kind_of_exercise;
		this.time = time;
		this.where = where;
		this.partner = partner;
	}
	
	public void printInfo() {
		System.out.println("date" + date + "kind_of_exercise" + kind_of_exercise + "time" + time + "where" + where + "partner" + partner);
	}
}
