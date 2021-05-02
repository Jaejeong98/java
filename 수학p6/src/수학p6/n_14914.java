package ¼öÇÐp6;

import java.util.*;

public class n_14914 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt(), num2=sc.nextInt();
		for(int i=1; i<=Math.min(num1, num2); i++) {
			if(num1%i==0&&num2%i==0)
				System.out.println(i+" "+num1/i+" "+num2/i);
		}
	}
}
