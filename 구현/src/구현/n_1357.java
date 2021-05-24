package ±¸Çö;

import java.util.*;

public class n_1357 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String num1=sc.next(), num2=sc.next();
		String n1="", n2="", result="";
		for(int i=num1.length()-1; i>=0; i--)
			n1+=num1.charAt(i);
		for(int i=num2.length()-1; i>=0; i--)
			n2+=num2.charAt(i);
		num1=Integer.toString(Integer.parseInt(n1)+Integer.parseInt(n2));
		for(int i=num1.length()-1; i>=0; i--)
			result+=num1.charAt(i);
		System.out.println(Integer.parseInt(result));
	}
}
