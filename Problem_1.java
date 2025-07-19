package in.HemashreeG;

import java.util.Scanner;

public class Problem_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of a");
		double a=sc.nextDouble();
		System.out.println("enter the value of b");
		double b=sc.nextDouble();
		System.out.println("enter the operation to perform(add,sub,mul,div)");
		String op=sc.next().toLowerCase();
		switch(op) {
		case"add":
			System.out.println("result=" +(a+b));
			break;
		case"sub":
			System.out.println("result="+(a-b));
			break;
		case"mul":
			System.out.println("result="+(a*b));
			break;
		case"div":
			if(b!=0) {
				System.out.println("result="+(a/b));
			}
			else {
				System.out.println("no cannot be divided by 0");
			}
			break;
			default:
				System.out.println("invalid choice");
		}
		

	}

}
