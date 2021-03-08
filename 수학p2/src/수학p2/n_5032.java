package ¼öÇÐp2;

import java.util.*;

public class n_5032 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int e=sc.nextInt(), f=sc.nextInt()+e, c=sc.nextInt(), sum=0;
		while(true) {
			if(f<c)
				break;
			sum+=f/c;
			f=f/c+f%c;
		}
		System.out.println(sum);
	}
}
