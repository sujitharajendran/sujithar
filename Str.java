package wipro;
import java.util.Scanner;
public class Str {
	public static void main(String[] args) {
		String r;
		Scanner sr=new Scanner(System.in);
		System.out.println("Enter the String:");
		r=sr.nextLine();
		int number = Integer.parseInt(r);
		System.out.println("The number is: " + number);
	}
}
