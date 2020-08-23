import java.util.Scanner;

public class SwitchDemo
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println("Enter number of ice cream flavors:");
    int numberOfFlavors = keyboard.nextInt();
    switch (numberOfFlavors)
    {
      case 32:
        System.out.println("Nice selection.");
        break;
      case 1:
        System.out.println("I bet it's vanilla.");
        break;
      case 2:
        System.out.println("2 flavors");
        break;
      case 3:
      case 4:
        System.out.println(numberOfFlavors + " flavors is acceptable");
        break;
      default:
        System.out.println("I didn't plan for" + numberOfFlavors + " flavors.");
        break;
    }
  }
}
