package ¼öÇÐp6;

import java.util.*;

public class n_15736 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long num=sc.nextLong(), count=0;
		for(int i=1; i*i<=num; i++)
			count++;
		System.out.println(count);
	}
}
