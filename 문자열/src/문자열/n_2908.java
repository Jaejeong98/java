package ¹®ÀÚ¿­;

import java.util.*;

public class n_2908 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt(), n2=sc.nextInt();
		n1=(n1/100)+(n1%100-n1%10)+(n1%10*100);
		n2=(n2/100)+(n2%100-n2%10)+(n2%10*100);
		System.out.println(Math.max(n1, n2));
	}
}
/*
 import java.util.*;

public class n_2908 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String n1=sc.next(), n2=sc.next();
		int n_1=0,  n_2=0;
		
		for(int i=0; i<3; i++) {
			n_1+=(Character.getNumericValue(n1.charAt(i)))*Math.pow(10, i);
			n_2+=(Character.getNumericValue(n2.charAt(i)))*Math.pow(10, i);
		}
		System.out.println(n_1>n_2? n_1:n_2);
	}
}
 */
