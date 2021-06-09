package ¼öÇÐp6;

import java.util.*;

public class n_21300 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st[]=sc.nextLine().split(" ");
		int sum=0;
		for(int i=0; i<6; i++)
			sum+=Integer.parseInt(st[i]);
		System.out.println(sum*5);
	}
}