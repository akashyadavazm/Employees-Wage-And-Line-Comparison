package employeeWage;

public class SwitchCase {
	public static final int isFullTime = 1;
	public static final int isPartTime = 2;
	public static final int empRatePerHrs = 20;

	public static void main(String[] args) {
//		Variables
		int empHrs;
		int empWage = 0;
		int empCheck = (int) Math.floor(Math.random() * 10) % 3;

		switch (empCheck) {
		case isFullTime:
			empHrs = 10;
			break;
		case isPartTime:
			empHrs = 8;
			break;
		default:
			empHrs = 0;
			break;
		}
		empWage = empHrs * empRatePerHrs;
		System.out.println("Total Employee Wages : " + empWage);

	}

}
