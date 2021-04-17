package ¼öÇÐ5p;

import java.util.*;

public class n_17284 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] st=sc.nextLine().split(" ");
		int arr[]=new int[4], p[]= {500, 800, 1000};
		for(int i=0; i<st.length; i++)
			arr[Integer.parseInt(st[i])]++;
		int sum=0;
		for(int i=1; i<=3;i++)
			sum+=arr[i]*p[i-1];
		System.out.println(5000-sum);
	}
}
