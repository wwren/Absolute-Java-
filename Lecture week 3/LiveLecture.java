import java.util.Scanner;
public class LiveLecture{
  public static void main(String[] args)
  {
//Q3 -
//	  Scanner keyboard = new Scanner(System.in);
//	  System.out.println("Enter some number: ");
//	  int n = keyboard.nextInt();
//	  int i = 1;
//	  int sum = 0;
//	  while (i <=n)
//	  {
//	  	sum += i;
//	  	i++;
//	  }
//	  System.out.println("Print out sum: "+sum);
//	  assert sum == (n *(n+1))/2; 
//	assertion needs to be a boolean */

// Q4 - 	  
//	  int i, j;
//	  int n = 10;
//	  for (j=1; j<=n; j++)
//	  {
//		  for(i=1; i<=j; i++)
//		  {
//				  System.out.print("*");
//			  }
//		  System.out.println("");
//			  
//		  }

// Q5 -
//	  int i, j, k;
//	  int n = 10;
//	  for (i=1; i<=n; i++) {
//		  for (j=n-i; j>=1; j--) {
//			  System.out.print(" ");
//		  }
//		  for (k=1; k<=i; k++) {
//			  System.out.print("*"); 
//		  }	  
//		  System.out.println("");
//	  }	
	  
//Q5 Alternative - 	  
//	  int i, j;
//	  String s = "*";
//	  int n = 10;
//	  for (i=1; i<=10; i++) {
//		  
//			  System.out.printf("%10s", s);
//			  s += "*";
//			  System.out.println(" ");
//
//	  }

//Q5 Alternative - 
	  int i, j, k;
	  String s = "*";
	  int n = 10;
	  for (i=1; i<=10; i++) {
		  k = 0;
		  for (j=1; j<=10; j++) {
			  if (k<n-i)
			  {
				  System.out.print(" ");
				  k++;
			  }				  
			  else
			  {
				  System.out.print(s);
			  }
		  }
		  System.out.println("");
	  }
	  
  }
}
