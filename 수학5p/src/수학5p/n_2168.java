package ¼öÇĞ5p;

import java.util.*;

public class n_2168 {
	public static int gcd(int num1, int num2) {
		if(num2==0)
			return num1;
		else
			return gcd(num2, num1%num2);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt(), num2=sc.nextInt();
		System.out.println(num1+num2-gcd(num1, num2));
	}
}
