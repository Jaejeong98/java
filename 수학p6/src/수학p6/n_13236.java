package ¼öÇÐp6;

import java.util.*;

public class n_13236 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		while(num!=1) {
			System.out.print(num+" ");
			if(num%2==0)
				num/=2;
			else
				num=num*3+1;
		}
		System.out.print(1);
	}
}
