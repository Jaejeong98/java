package ±¸Çö2;

import java.util.*;

public class n_17614 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt(), count=0;
		for(int i=1; i<=num; i++) {
			String n=Integer.toString(i);
			for(int j=0; j<n.length(); j++) {
				if(n.charAt(j)=='3'||n.charAt(j)=='6'||n.charAt(j)=='9')
					count++;
			}
		}
		System.out.println(count);
	}
}
