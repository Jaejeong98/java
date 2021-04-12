package ¼öÇĞ5p;

import java.util.*;

public class n_13985 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String[] st=sc.nextLine().split(" ");
		int num1=Integer.parseInt(st[0]), num2=Integer.parseInt(st[2]), num3=Integer.parseInt(st[4]);
		if(num3==num1+num2)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
