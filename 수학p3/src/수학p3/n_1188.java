package ¼öÇĞp3;

import java.util.*;

public class n_1188 {
	public static int gcd(int num1, int num2) {
		if(num2==0)
			return num1;
		else
			return gcd(num2, num1%num2);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sau=sc.nextInt(), rev=sc.nextInt();
		System.out.println(rev-gcd(sau,rev));
	}
}