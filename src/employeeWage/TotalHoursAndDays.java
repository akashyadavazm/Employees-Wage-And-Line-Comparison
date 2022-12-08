package employeeWage;

public class TotalHoursAndDays {
	public static final int isFullTime = 1;
	public static final int isPartTime = 2;
	public static final int empRatePerHrs = 20;
	public static final int numOfWorkingDays = 20;
	public static final int maxWorkingHrs = 100;

	public static void main(String[] args) {
//		Variables
		int empHrs;
		int totalHrs = 0, totalWorkingDays = 0;
		while (totalHrs <= maxWorkingHrs && totalWorkingDays <= numOfWorkingDays) {
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case isFullTime:
				empHrs = 10;
				break;
			case isPartTime:
				empHrs = 8;
			default:
				empHrs = 0;
				break;
			}
			totalHrs += empHrs;
			System.out.println("Days: " + totalWorkingDays + " Total Working Hours : " + totalHrs);
		}
		int totalEmpWage = totalHrs * empRatePerHrs;
		System.out.println("Total employee Wages : " + totalEmpWage);
	}

}
