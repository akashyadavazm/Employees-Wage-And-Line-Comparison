package lineComparison;

import java.util.Scanner;

public class CalculateItsLength {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x2");
		int x2 = sc.nextInt();
		System.out.println("Enter the value of x1");
		int x1 = sc.nextInt();
		System.out.println("Enter the value of y2");
		int y2 = sc.nextInt();
		System.out.println("Enter the value of y1");
		int y1 = sc.nextInt();
		sc.close();

		double length;
		length = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		System.out.println("Length : " + length);
	}

}
