package ±¸Çö2;

import java.util.*;

public class n_10395 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] st1=sc.nextLine().split(" "), st2=sc.nextLine().split(" ");
		boolean b=false;
		for(int i=0; i<5; i++) {
			int n=Integer.parseInt(st1[i])+Integer.parseInt(st2[i]);
			if(n!=1) b=true;
		}
		System.out.println(b?"N":"Y");
	}
}