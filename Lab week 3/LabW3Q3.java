import java.util.Scanner;

public class LabW3Q3 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		double numOfHour, wage;
		System.out.println("Ender number of hours worked: ");
		numOfHour = keyboard.nextDouble();
		
		if (numOfHour < 40)
		{
			wage = 8.25 * numOfHour;
		}
		else
		{
			wage = 8.25 * 40 + 1.5 * 8.25 * (numOfHour -40);
		}
		System.out.println("Wage earned: " + wage);
			
	}
}