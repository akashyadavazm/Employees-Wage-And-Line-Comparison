package lineComparison;

import java.util.Scanner;

public class CheckLineComparison {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give Co-ordinates for line1");
		System.out.println("Enter the value of x2");
		int x2 = sc.nextInt();
		System.out.println("Enter the value of x1");
		int x1 = sc.nextInt();
		System.out.println("Enter the value of y2");
		int y2 = sc.nextInt();
		System.out.println("Enter the value of y1");
		int y1 = sc.nextInt();

		System.out.println("Give Co-ordinates for line2");
		System.out.println("Enter the value of x4");
		int x4 = sc.nextInt();
		System.out.println("Enter the value of x3");
		int x3 = sc.nextInt();
		System.out.println("Enter the value of y4");
		int y4 = sc.nextInt();
		System.out.println("Enter the value of y3");
		int y3 = sc.nextInt();
		sc.close();

		int length1 = (int) Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		System.out.println("\nLength of line 1 is : " + length1);
		int length2 = (int) Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));
		System.out.println("\nLength of line 2 is : " + length2);
		
		if(length1 == length2) {
			System.out.println("\nBoth the Lines are equal");
		}
		else
		{
			System.out.println("\nBoth the lines have different length");
		}
	}

}