import java.text.DecimalFormat;
public class DecimalFormatDemo {
	public static void main(String[] args) {
		//format to String, # is optional, 0 is must
		DecimalFormat pat000dot000 = new DecimalFormat("000.000");
		System.out.println(pat000dot000.format(12.345678));
		// format to percentage 
		DecimalFormat patPec = new DecimalFormat("000.0##%");
		System.out.println(patPec.format(12.345678));
		// format to E
		DecimalFormat patE = new DecimalFormat("0.###E0");
		System.out.println(patE.format(12.345678));
	}
}