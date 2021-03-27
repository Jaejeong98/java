package ¼öÇÐp4;

import java.util.*;

public class n_11179 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		String n=Integer.toBinaryString(num), st_r=new String();
		for(int i=n.length()-1; i>=0; i--)
			st_r+=n.charAt(i);
		System.out.println(Integer.parseInt(st_r,2));
	}
}
