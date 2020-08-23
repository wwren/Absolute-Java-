public class IfElseDemo
{
  public static void main(String[] args)
  {
    int salary = 3000, bonus = 500, minimum = 50000, deduction = 300; 
    int sales = Integer.parseInt(args[0]);
    if (sales > minimum) 
    {
      System.out.println("Good job! You get a bonus");
      salary = salary + bonus;
      if (sales > minimum + 30000) 
      {
        salary = salary + 200;
      }
    }
    else
    {
      System.out.println("You should work harder");
      salary = salary - deduction;
    }
    System.out.printf("Your salary is %d\n", salary);
  }
}
