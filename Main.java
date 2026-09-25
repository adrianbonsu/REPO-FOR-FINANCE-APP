import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in)     // COMPILE ERROR ON THIS LINE, MISSING SEMICOLON
		int days=in.nextInt();
		int weeks = days / 7;
		int daysLeftOver = (days % 7) + 1;		// LOGIC ERROR THIS LINE, OFF BY ONE ON daysLeftOver
		System.out.println("Weeks = "+weeks);
		System.out.println("Days Left Over = "+daysLeftOver);		
	}
}
