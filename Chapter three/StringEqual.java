public class StringEqual {
	public static void main(String[] args) {
		//for String, == tests whether two strings refer to the same object
		//String.equals(Other_String) or String.equalsIgnoreCaes(Other_String)
		String s1 = "Hello World";
		String s2 = "hello world";
		if (s1.equals(s2))
			System.out.println("\"" + s1 + "\"" + " equals " + "\"" + s2 + "\".");
		else if (s1.equalsIgnoreCase(s2))
			System.out.println("\"" + s1 + "\"" + " equals " + "\"" + s2 + "\"" + ", when case not considered.");
		else
			System.out.println("\"" + s1 + "\"" + " does not equal " + "\"" + s2 + "\"");
	}
}