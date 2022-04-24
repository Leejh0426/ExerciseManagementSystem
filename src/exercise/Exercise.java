package exercise;

import java.util.Scanner;

public class Exercise {
	protected ExerciseKind kind = ExerciseKind.Health;

	protected String date;
	protected int time;
	protected String where;
	protected String partner;
	
	public Exercise() {
		
	}
	
	public Exercise(String date) {
		this.date = date;
	}
	
	public Exercise(String date,int time, String where, String partner) {
		this.date = date;
		this.time = time;
		this.where = where;
		this.partner = partner;
	}
	
	public ExerciseKind getKind() {
		return kind;
	}

	public void setKind(ExerciseKind kind) {
		this.kind = kind;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public String getWhere() {
		return where;
	}

	public void setWhere(String where) {
		this.where = where;
	}

	public String getPartner() {
		return partner;
	}

	public void setPartner(String partner) {
		this.partner = partner;
	}

	
	public void printInfo() {
		System.out.println("date" + date + "time" + time + "where" + where + "partner" + partner);
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
}
