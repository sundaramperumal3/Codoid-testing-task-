package BasicJava;

import java.util.Scanner;

public class Factorial_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the factorial no:");
		int num=sc.nextInt();
		int fact=num;
		for(int i=2; i<fact; i++) {
			num=fact*fact;
		}
		System.out.println(fact);
	}

}
