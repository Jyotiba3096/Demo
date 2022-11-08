import java.util.Scanner;

public class Cal1 {
	int num;      //for taking numbers from user
//method for addition of numbers
	public void addition() {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			System.out.println("Please enter number " + i + " for addition");
			int a = scanner.nextInt();
			sum = sum + a;
		}
		System.out.println("Addition is = " + sum);
		scanner.close();
	}
//method for subtraction of numbers
	public void difference() {
		Scanner scanner = new Scanner(System.in);
		int diff = 0;
		for (int i = 1; i <= num; i++) {
			System.out.println("Please enter number " + i + " for subtrcaction");
			int a = scanner.nextInt();
			diff = diff - a;
			if (diff >= 0) {
				diff -= diff;
			} else {
				diff = -diff;
			}	
		}
		System.out.println("Subtraction is = " + diff);
		scanner.close();
	}

	public static void main(String[] args) {
		Cal1 cal = new Cal1();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter no. to perform calculation");

		cal.num = scanner.nextInt();
		System.out.println("Please choose operator from +,-,*,/");
		String input = scanner.next();
		if (input.equals("+")) {
			cal.addition();
		}
		if (input.equals("-")) {
			cal.difference();
		}
scanner.close();
	}

}
