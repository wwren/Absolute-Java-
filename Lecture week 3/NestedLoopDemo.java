public class NestedLoopDemo
{
  public static void main(String[] args)
  {
    char printedCharacter = 'A';
    big_loop:
    for (int i = 0; i < 10; i++)
    {
      for (int j = 0; j < 20; j++)
      {    
        System.out.printf("%c", printedCharacter);
      }
      printedCharacter += 1;
      System.out.println();
    }
  }
}
