package exercise;

import java.util.Scanner;

import exception.DateFormatException;
import exception.PartnerFormatException;

public abstract class Exercise implements ExerciseInput {			//�������̽� �ȿ��ִ°� ������ ���� �������� �߰������� �˾Ƽ�.
	protected ExerciseKind kind = ExerciseKind.Health;

	protected String date;
	protected int time;
	protected String where;
	protected String partner;

	public Exercise() {

	}

	public Exercise(ExerciseKind kind) {
		this.kind = kind;
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

	public void setDate(String date) throws DateFormatException {
		if(!date.contains("��")|| !date.contains("��"))
			throw new DateFormatException();
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

	public void setPartner(String partner) throws PartnerFormatException {
		if(partner.length()!=3 && !partner.equals(""))
			throw new PartnerFormatException();
		this.partner = partner;
	}

	public void setExerciseDate(Scanner sc) {
		String date = "";
		while(!date.contains("��")|| !date.contains("��")) {
			System.out.print("Exercise date, (0��0��) ");
			date = sc.next();
			try {
				this.setDate(date);
			} catch (DateFormatException e) {
				System.out.println("Incorrect Date Format. Put the Date that contains \"��\" and \"��\"");
			}
		}
	}

	public void setExerciseTime(Scanner sc) {
		System.out.print("time(miniute)");
		int time = sc.nextInt();
		this.setTime(time);
	}

	public void setExerciseWhere(Scanner sc) {
		System.out.print("where");
		String where = sc.next();
		this.setWhere(where);
	}


	public void setExercisePartner(Scanner sc) {
		String partner="";
		while(partner.length() != 3) {
			System.out.print("partner");
			partner = sc.next();
			try {
				this.setPartner(partner);
			} catch (PartnerFormatException e) {
				System.out.println("Incorrect Partner name Format. Put the partner First and Last names");
				e.printStackTrace();
			}
		}
	}

}




