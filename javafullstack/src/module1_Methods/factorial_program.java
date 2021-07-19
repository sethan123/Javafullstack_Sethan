package module1_Methods;

import java.util.Scanner;

public class factorial_program {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
				System.out.println("enter the fact number");
				int num=scn.nextInt();
				int fact=1;
				while (num>0)
				{
					fact=fact*num;
					num--;
				}
				System.out.println(fact);
				
	}

}
