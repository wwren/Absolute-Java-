import java.util.Scanner;
public class AverageFor{
	public static void main(String[] args) {
		//for(initialization; Boolean_expression; update)
		//for can have an empty body: ;
		System.out.println("Enter a list of non-negative numbers. ");
		System.out.println("Mark the end with a negative number.");
		Scanner keyboard = new Scanner(System.in);
		
		double next = keyboard.nextDouble(), sum;
		int count = 0;
		for(sum=0; next >=0; count++)
		{
			sum += next;
			next = keyboard.nextDouble();
		}
	
		if (count == 0)
			System.out.println("No number entered.");
		else
		{
			System.out.printf("%d numbers entered.", count);	
			double average = sum / count;
			System.out.print("Average is " + average);
		}
	}
}