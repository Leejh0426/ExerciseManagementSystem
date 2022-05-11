package exercise;

import java.util.Scanner;

import exception.DateFormatException;
import exception.PartnerFormatException;

public interface ExerciseInput {
	
	public void setDate(String date) throws DateFormatException;
	
	public String getDate();
	
	public void setTime(int time);
	
	public void setWhere(String where);
	
	public void setPartner(String partner) throws PartnerFormatException;
	
	public void printInfo();
	
	public void getUserInput(Scanner sc);
	
	public void setExerciseDate(Scanner sc);
	
	public void setExerciseTime(Scanner sc);
	
	public void setExerciseWhere(Scanner sc);
	
	public void setExercisePartner(Scanner sc);
	
}
