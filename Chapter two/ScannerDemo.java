import java.util.Scanner;

public class ScannerDemo{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the number of pods followed by");
		System.out.println("the number of peas in a pod: ");
		// input function, input int
		int numberOfPods = keyboard.nextInt();
		int peasPerPod = keyboard.nextInt();
		int totalNumberOfPeas = numberOfPods * peasPerPod;
		System.out.println(numberOfPods + " pods " + peasPerPod + " peas per pod.");
		System.out.println("The total number of peas = "+ totalNumberOfPeas);
		// input double
		System.out.println("Next enter two number, decimal allowed: ");
		double d1, d2;
		d1 = keyboard.nextDouble();
		d2 = keyboard.nextDouble();
		System.out.println("You entered "+ d1 + " and " + d2);
		// input String 
		System.out.println("Next enter two words: ");
		String w1, w2;
		w1 = keyboard.next();
		w2 = keyboard.next();
		System.out.println("The two words you entered are "+ w1 + " and " + w2);	
	}
}

