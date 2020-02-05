package StringTask;

import java.util.Scanner;

public class grouptask {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please a month number");
		int month=scan.nextInt();
		System.out.println("Please input a year");
		int year=scan.nextInt();
		month=2;
		int day=scan.nextInt();
		if (month==2 && year==2016&&day==29) {
			System.out.println("February 2016 has 29 days");
		}
		else {
			System.out.println("It is not February 2016");
		}
}
}
