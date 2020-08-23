public class ConditionalOperator
{
  public static void main(String[] args)
  {
    int salary = 3000, bonus = 300, minimum = 40000;
    int sales = Integer.parseInt(args[0]);
    salary = (sales > 40000) ? salary + bonus : salary;
    System.out.println(salary);
  }
}
