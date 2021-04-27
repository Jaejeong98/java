package ¼öÇÐ5p;

import java.util.*;

public class n_13909 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt(), count=0;
		for(int i=1; i*i<=num; i++) 
			count++;
		System.out.print(count);
	}
}
