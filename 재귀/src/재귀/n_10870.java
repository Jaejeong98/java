package Àç±Í;

import java.util.*;

public class n_10870 {
	public static int fib(int n) {
		if(n>=2)
			n=fib(n-1)+fib(n-2);
		return n;
			
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(fib(n));
	}
}
