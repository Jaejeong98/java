package Àç±Í;

import java.util.*;

public class n_10872 {
	public static int value=1;
	public static void fact(int num) {
		if(num>0) {
			value*=num;
			num--;
			fact(num);
		}
		else
			return;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		fact(n);
		System.out.println(value);
	}
}
