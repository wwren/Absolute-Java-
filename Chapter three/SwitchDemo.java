import java.util.Scanner;
public class SwitchDemo{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter number of ice cream flavours: ");
		int numberOfFlavour = keyboard.nextInt();
		
		switch (numberOfFlavour) //controlling expression
		{
		case 1: //case labels share same data type as controlling expression
			System.out.println("I bet it's vanilla.");
			break;
		case 2:
		case 3:
		case 4:
			System.out.println(numberOfFlavour + " flavours" + " is acceptable.");
			break; //from 2 - 4 no break, run until reach break 
		default: //if no match cases are found, run default 
			System.out.print("I didn't plan for " +numberOfFlavour + " flavours." );
			break; 
		}
	}
}