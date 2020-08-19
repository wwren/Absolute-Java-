import java.util.Scanner;

public class LabW3Addition1 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int coupon, candyBar, gumball, left;
		System.out.println("How many coupons do you have: ");
		coupon = keyboard.nextInt();
		
		if (coupon/10 !=0)
		{
			candyBar = coupon/10;
			gumball = (coupon%10)/3;
			left = coupon - candyBar*10 - gumball*3;
		}	
		else
		{
			candyBar = 0;
			gumball = coupon/3;
			left = coupon - candyBar*10 - gumball*3;
		}
		System.out.printf("With %d coupon(s) you can get %d candy bars and %d gumballs %n", coupon, candyBar, gumball);
		System.out.printf("This will leave you with %d coupons", left);
	}
}