import java.util.Scanner;
import java.lang.Math;

public class LabW3Q2{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter radius of a sphere: ");
		double radius, volumn, area;
		
		radius = keyboard.nextDouble();
		
		volumn = 4.0/3*Math.PI*Math.pow(radius, 3);
		System.out.printf("Volumn of a sphere: %.2f \n", volumn);
		
		area = 4*Math.PI*Math.pow(radius, 2);
		System.out.printf("Area of a sphere: %.2f", area);
		
		
	}
}