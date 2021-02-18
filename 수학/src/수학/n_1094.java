package ¼öÇĞ;

import java.util.*;

public class n_1094 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int X=sc.nextInt();
		int bar=64,count=1,sum=0;
		while(true) {
			if(X<bar+sum)
				bar/=2;
			else if(X>bar+sum) {
				sum+=bar;
				bar/=2;
				count++;
			}
			else
				break;
		}
		System.out.println(count);
	}
}
