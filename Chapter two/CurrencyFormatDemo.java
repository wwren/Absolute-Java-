import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormatDemo
{
	public static void main(String[] args){
	System.out.println("Without formatting:");
	System.out.println(19.81111);
	System.out.println();
	
	double price = 19.12345;
	System.out.println("Default location: ");
	NumberFormat moneyFormat = NumberFormat.getCurrencyInstance(); 
	//class - NumberFormat
	//method invocation NumberFormat.get() produces an object that formats number according to default location
	System.out.println(moneyFormat.format(price));
	//object belonging to class NumberFormat has method of price
	
	NumberFormat moneyFormatYuan = NumberFormat.getCurrencyInstance(Locale.CHINA);
	//class - Locale
	//constant - Locale.US | Locale.China
	System.out.println(moneyFormatYuan.format(price));
	}
}