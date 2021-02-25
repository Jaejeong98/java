package ¼öÇÐ;

import java.util.*;

public class n_1748 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),count=0, num=0;
		count=String.valueOf(n).length();
		for(int i=1; i<count; i++) {
			num+=(Math.pow(10,i)-Math.pow(10, i-1))*i;
		}
		num+=(n+1-(int)Math.pow(10,count-1))*(count);
		System.out.println(num);
	}
}
