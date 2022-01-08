package ±¸Çö3;

import java.util.*;

public class n_18408 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		for(int i=0; i<3; i++) {
			count=sc.nextInt()==1?count+1:count-1;
		}
		System.out.print(count>0? 1:2);
	}
}
