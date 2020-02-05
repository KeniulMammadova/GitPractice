package StringTask;

import java.util.Scanner;

public class Task1 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter the 1st number");
	int num1=scan.nextInt();
	System.out.println("Please enter 2nd number");
	int num2=scan.nextInt();
	System.out.println("Please enter 3rd number");
	int num3=scan.nextInt();
	
	if(num1>num2&&num1>num3) {
		System.out.println("The grates number is " +num1 );
	}else if (num2>num1&&num2>num3) {
			System.out.println("The grates number is " +num2 );
		}else {
			System.out.println("The grates number is " +num3 );
		}
		}
	}


