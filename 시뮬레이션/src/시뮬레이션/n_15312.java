package ½Ã¹Ä·¹ÀÌ¼Ç;

import java.util.*;

public class n_15312 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st1=sc.nextLine(), st2=sc.nextLine(), st3=new String();
		int[] arr=new int[st1.length()*2],num={3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};
		for(int i=0; i<st1.length(); i++) {
			st3+=num[st1.charAt(i)-'A'];
			st3+=num[st2.charAt(i)-'A'];
		}
		while(st3.length()!=2) {
			String st4=new String();
			for(int i=0; i<st3.length()-1; i++) {
				int n=st3.charAt(i)-'0'+st3.charAt(i+1)-'0';
				st4+=n>=10?n-10:n;
			}
			st3=st4;
		}
		System.out.println(st3);
	}
}