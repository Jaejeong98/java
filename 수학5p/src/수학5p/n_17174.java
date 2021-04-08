package ¼öÇĞ5p;

import java.util.*;

public class n_17174 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt(), num2=sc.nextInt(), sum=0;
		while(num1>0) {
			sum+=num1;
			num1/=num2;
		}
		System.out.println(sum);
	}
}
