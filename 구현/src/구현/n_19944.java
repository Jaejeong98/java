package ±¸Çö;

import java.util.*;

public class n_19944 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt(), num2=sc.nextInt();
		if(num2==1||num2==2)
			System.out.println("NEWBIE!");
		else if(num2<=num1)
			System.out.println("OLDBIE!");
		else
			System.out.println("TLE!");
	}
}