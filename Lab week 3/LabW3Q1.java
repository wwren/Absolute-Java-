import java.util.Scanner;

public class LabW3Q1{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter first input, no need to be integer");
		float a = keyboard.nextFloat();
		System.out.println("Enter Second input, no need to be integer");
		float b = keyboard.nextFloat();
		
		float sum = a+b;
		float diff = a-b;
		float prod = a*b;
		
		System.out.println("First input: " + a);
		System.out.println("Second input: " + b);
		System.out.printf("Sum: %.5f, Difference: %.5f, Product: %.5f", sum, diff, prod);
	}
}