public class AssertionDemo
{
  public static void main(String[] args)
  {
    int i;
    for (i = 0; i < 10; i++)
    {
      System.out.printf("i = %d\n", i);
    }
    assert(i == 10);
  }
}
