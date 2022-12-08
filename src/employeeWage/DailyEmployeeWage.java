package employeeWage;

public class DailyEmployeeWage {

	public static void main(String[] args) {

		int wagePerHrs = 20;
		int fullDayHrs;

		int attndCheck = (int) Math.floor(Math.random() * 10) % 2;
		if (attndCheck == 1) {
			fullDayHrs = 8;
		} else {
			fullDayHrs = 0;
		}
		fullDayHrs=+fullDayHrs;
		int dailyEmpWage = fullDayHrs * wagePerHrs;

		System.out.println("Dialy Employees Wages are : " + dailyEmpWage);

	}

}
