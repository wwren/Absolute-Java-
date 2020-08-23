import java.util.Scanner;
public class DebuggingDemo
{
  public static void main(String[] args)
  {
    String s = ""; //Empty string
    char c = ' '; //Space character
    Scanner keyboard = new Scanner(System.in);		
    do
    {
      System.out.println("Enter 'A' for option A " +
		         "or Enter 'B' for option B.");
      s = keyboard.next();
      s = s.toLowerCase();
			
      c = s.charAt(0);
    } while ((c != 'a') && (c != 'b'));
  }
}
