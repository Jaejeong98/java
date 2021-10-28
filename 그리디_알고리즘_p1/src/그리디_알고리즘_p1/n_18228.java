package 그리디_알고리즘_p1;

import java.util.*;

public class n_18228 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt(), r1=Integer.MAX_VALUE, r2=Integer.MAX_VALUE;
		boolean b=true;
		for(int i=0; i<T; i++) {
			int num=sc.nextInt();
			if(num==-1) { b=false; continue; }
			if(b) { if(r1>num) r1=num; }
			else { if(r2>num) r2=num; }
		}
		System.out.println(r1+r2);
	}
}