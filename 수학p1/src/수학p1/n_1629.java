package ¼öÇÐp1;

import java.util.*;

public class n_1629 {
	public static long func(long n1, long n2, long n3) {
		long num;
		if(n2==0) return 1;
		else if(n2==1) return n1%n3;
		else if(n2%2==0) {
			num=func(n1, n2/2, n3)%n3;
			return num*num%n3;
		}
		else return n1%n3*func(n1, n2-1, n3)%n3;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long num1=sc.nextInt(), num2=sc.nextInt(), num3=sc.nextInt();
		System.out.println(func(num1, num2, num3));
	}
}