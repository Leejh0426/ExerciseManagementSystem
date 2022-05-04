package exercise;

import java.util.Scanner;

public interface ExerciseInput {
	
	public void setDate(String date);
	
	public String getDate();
	
	public void setTime(int time);
	
	public void setWhere(String where);
	
	public void setPartner(String partner);
	
	public void printInfo();
	
	public void getUserInput(Scanner sc);
	
	
}
