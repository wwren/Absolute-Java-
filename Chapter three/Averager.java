import java.util.Scanner;

public class Averager{
	public static void main(String[] args) {
		System.out.println("Enter a list of non-negative numbers. ");
		System.out.println("Mark the end with a negative number.");
		Scanner keyboard = new Scanner(System.in);
		
		double next = keyboard.nextDouble(), sum=0;
		int count = 0;
		// while condition is true => run
		// do-while will run the code block then evaluate condition 
		while (next >=0)
		{
			sum +=next;
			count++;
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
