import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TextFileDemo{
	public static void main(String[] args) {
		Scanner fileIn = null; //initialize fileIn to empty
		try {
			fileIn = new Scanner(new FileInputStream("player.txt"));
		}
		catch (FileNotFoundException e) {
			System.out.println("File not found.");
			System.exit(0);	
		}
		int highScore;
		String name;
		System.out.println("Text left to read? " + fileIn.hasNextLine());
		highScore = fileIn.nextInt();
		fileIn.nextLine();
		name = fileIn.nextLine();
		
		System.out.println("Name: "+name);
		System.out.println("High score: "+ highScore);
		System.out.println("Text left to read? "+ fileIn.hasNextLine());
		fileIn.close();
	}
}