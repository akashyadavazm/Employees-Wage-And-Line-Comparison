package employeeWage;

public class PartTimeEmployeeWage {

	public static void main(String[] args) {
//		Constants
		int empWageHrs = 20;
		int prsntPartTime = 1;
		int prsntFullTime = 2;
//		Variables
		int empHrs = 0;
		int dailyEmpWages = 0;
		int empAttendance = (int) Math.floor(Math.random() * 10) % 3;
		if (empAttendance == prsntPartTime) {
			empHrs = 8;
		} else if (empAttendance == prsntFullTime) {
			empHrs = 10;
		} else {
			empHrs = 0;
		}
		dailyEmpWages = empHrs * empWageHrs;
		System.out.println("Daily Employees Wages : " + dailyEmpWages);

	}

}
