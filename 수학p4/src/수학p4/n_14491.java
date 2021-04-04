package ¼öÇĞp4;

import java.util.*;

public class n_14491 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt(), i=0,st=0;
		while(num>0) {
			st+=num%9*(int)Math.pow(10, i);
			i++;
			num/=9;
		}
		System.out.println(st);
	}
}
