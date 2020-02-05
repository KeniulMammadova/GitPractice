package StringTask;

import java.util.Scanner;

public class task2 {

public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Please a month number");
	int month=scan.nextInt();
	System.out.println("Please input a year");
	int year=scan.nextInt();
	
	if (month==2 && year==2016) {
		System.out.println("February 2016 has 29 days");
	}
	else {
		System.out.println("It is not February 2016");
	}
	
	 }
	 
 }

