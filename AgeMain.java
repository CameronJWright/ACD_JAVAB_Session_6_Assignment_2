package Session6;

import java.util.Scanner;

public class AgeMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		try {
			System.out.println("Enter the age!");
			System.out.println("You've entered " + checkAge(scan.nextInt()));
			System.out.println("Enter the age!");
			System.out.println("You've entered " + checkAge(scan.nextInt()));
		} catch (NegativeAgeException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		scan.close();
	}

	static int checkAge(int age) throws NegativeAgeException {
		if (age < 0)
			throw new NegativeAgeException("You cannot input a negative age.");
		else
			return age;
	}
}

class NegativeAgeException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NegativeAgeException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}

}
