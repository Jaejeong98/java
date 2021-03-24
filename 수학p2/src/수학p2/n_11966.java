package ¼öÇÐp2;

import java.util.*;

public class n_11966 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(), i=0;
		boolean t=false;
		while(i<=30) {
			if(Math.pow(2, i)==n) {
				t=true;
				break;
			}
			i++;
		}
		if(t==true)
			System.out.println(1);
		else
			System.out.println(0);
	}
}
