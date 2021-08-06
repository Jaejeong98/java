package 브루트포스_알고리즘;

import java.util.*;

public class n_1120 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st1=sc.next(), st2=sc.next();
		int num=Integer.MAX_VALUE;
		for(int i=0; i<=st2.length()-st1.length(); i++) {
			int count=0;
			for(int j=0; j<st1.length(); j++) {
				if(st1.charAt(j)!=st2.charAt(i+j)) count++;
			}
			num=Math.min(num, count);
		}
		System.out.println(num);
	}
}
