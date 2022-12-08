package employeeWage;

public class WageForMonth {
	public static final int isFullTime = 1;
	public static final int isPartTime = 2;
	public static final int empRatePerHrs = 20;
	public static final int workingDays = 20;

	public static void main(String[] args) {
//		Variables
		int empHrs;
		int empWage, totalEmpWage = 0;
		for (int day = 0; day < workingDays; day++) {
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
			}
			empWage = empHrs * empRatePerHrs;
			totalEmpWage += empWage;
			System.out.println("Employee Wage: " + empWage);
		}
		System.out.println("Total Employee Wage : " + totalEmpWage);
	}

}
