package ¼öÇÐp3;

import java.util.*;

public class n_15667 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(), f=0;
		while(true) {
			if(f*f+f+1==n) {
				System.out.println(f);
				break;
			}
			else
				f++;
		}
	}
}
