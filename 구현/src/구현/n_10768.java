package ±¸Çö;

import java.util.*;

public class n_10768 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt(), num2=sc.nextInt();
		if(num1== 1 || (num1== 2 &&num2<18))
			System.out.println("Before");
		else if(num1==2&&num2==18)
			System.out.println("Special");
		else
			System.out.println("After");
	}
}