package ¼öÇÐ5p;

import java.util.*;

public class n_18005 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num%4==0)
			System.out.println(2);
		else if(num%4==1||num%4==3)
			System.out.println(0);
		else
			System.out.println(1);
	}
}
