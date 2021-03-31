package ¼öÇÐp4;

import java.util.*;

public class n_15700 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt(), num2=sc.nextInt();
		if(num1%2==0)
			System.out.println(num1/2*num2);
		else if(num2%2==0)
			System.out.println(num2/2*num1);
		else
			System.out.println(num1/2*num2+num2/2);
	}
}
