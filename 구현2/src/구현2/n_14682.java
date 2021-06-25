package ±¸Çö2;

import java.util.*;

public class n_14682 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt(), num2=sc.nextInt(), num=0;
		for(int i=0; i<=num2; i++)
			num+=num1*Math.pow(10,i);
		System.out.println(num);
	}
}
