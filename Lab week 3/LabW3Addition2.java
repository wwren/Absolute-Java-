import java.util.Scanner;

public class LabW3Addition2 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the change (without $): ");
		double bill = keyboard.nextDouble(); //what you type in System.in is String
		
		keyboard.close();
		
		double cent;
		int fifNote, twenNote, tenNote, fivNote, twoNote, oneDollar, fifCent, twenCent, tenCent, fivCent; 
		
		fifNote = (int)bill/50;
		twenNote = ((int)bill - fifNote * 50)/20;
		tenNote = ((int)bill - fifNote * 50 - twenNote * 20)/10;
		fivNote = ((int)bill - fifNote * 50 - twenNote * 20 - tenNote*10)/5;
		twoNote = ((int)bill - fifNote * 50 - twenNote * 20 - tenNote*10 - fivNote*5)/2;
		oneDollar = (int)bill - fifNote * 50 - twenNote * 20 - tenNote *10 - fivNote*5 - twoNote*2;
		
		cent = 100*(bill - (fifNote * 50 + twenNote * 20 + tenNote *10 + fivNote*5 + twoNote*2 + oneDollar)); 
		
		fifCent = (int)cent /50;
		twenCent = ((int)cent - fifCent*50) /20;
		tenCent = ((int)cent - fifCent * 50 - twenCent * 20) /10;
		fivCent = ((int)cent - fifCent * 50 - twenCent * 20 - tenCent *10) /5;
		
		System.out.println("Please give the customer: ");
		System.out.println("$50: " + fifNote);
		System.out.println("$20: " + twenNote);
		System.out.println("$10: " + tenNote);
		System.out.println("$5: " + fivNote);
		System.out.println("$2: " + twoNote);
		System.out.println("$1: " + oneDollar);
		
		System.out.println("50c: " + fifCent);
		System.out.println("20c: " + twenCent);
		System.out.println("10c: " + tenCent);
		System.out.println("5c: " + fivCent);
		
//		int val = Integer.parseInt(args[0]); //args[0] read String, parseInt() read and convert to Int
//		System.out.println(val); 
		
	}
}