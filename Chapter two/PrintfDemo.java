public class PrintfDemo
{
	public static void main(String[] args) {
		String aString = "abc";
		System.out.println("String output:");
		System.out.println("START123456789");
		System.out.printf("START%sEND %n", aString);
		System.out.printf("START%4sEND %n", aString);
		System.out.printf("START%2sEND %n", aString);
		System.out.println(" ");
		
		char aChar = 'Z';
		System.out.printf("START%4cEND %n", aChar);
		System.out.printf("START%-4cEND", aChar);
		System.out.println(" ");
		
		double aDouble = 1234.1234567;
		System.out.printf("START%fEND %n", aDouble);
		System.out.printf("START%.4fEND %n", aDouble);
		System.out.printf("START%.2fEND %n", aDouble);
		System.out.printf("START%12.4fEND %n", aDouble);
		System.out.printf("START%eEND %n", aDouble);
		System.out.printf("START%14eEND", aDouble);
	}
}