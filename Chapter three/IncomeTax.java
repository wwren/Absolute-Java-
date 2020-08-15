import java.util.Scanner;

public class IncomeTax {
	public static void	main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		double netIncome, tax, fivePercentTax, tenPercentTax;
		
		System.out.println("Enter net income.\n"
				 + "Do not include a dollar sign or any commas: ");
		netIncome = keyboard.nextDouble( );
		
		if (netIncome <= 15000)
		{
			System.out.println("No tax");
			tax = 0;
		}
		else if (netIncome <=30000)
		{
			System.out.println("5% tax");
			tax = (0.05 * (netIncome - 15000));	
		}
		else 
		{
			fivePercentTax = 0.05*15000;
			tenPercentTax = 0.1 * (netIncome - 30000);
			tax = fivePercentTax + tenPercentTax;
		}
		System.out.printf("Tax due = $%.3f", tax);
	}
}