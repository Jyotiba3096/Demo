import java.util.Scanner;

public class Calculator {
	
	
	
		
	
	public static void main(String[] args) {
		
		System.out.println("Please enter no. to be added");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int sum=0, dif=0, dif1=0;
		for(int i =0;i<num;i++) {
		System.out.println("Please enter number ");
		int a = scanner.nextInt();
		sum=sum+a;
		dif=dif1-a;
		dif1=-dif;
		dif=0;
		System.out.println("Difference is = "+dif1);
		}	
		System.out.println("Addition is = " +sum);
		
	}

}
