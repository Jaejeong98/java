package 그리디_알고리즘_p1;

import java.util.*;

public class n_17615 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt(), r=0,b=0;
		boolean c=false;
		String st[]=sc.next().split("");
		for(int i=1; i<T; i++) {
			if(st[i].equals(st[i-1])&&!c) continue;
			else {
				c=true;
				if(st[i].equals("R")) r++;
				else b++;
			}
		}
		int r1=Math.min(r,b);
		r=0;b=0;
		c=false;
		for(int i=T-2; i>=0; i--) {
			if(st[i].equals(st[i+1])&&!c) continue;
			else {
				c=true;
				if(st[i].equals("R")) r++;
				else b++;
			}
		}
		int r2=Math.min(r, b);
		System.out.println(Math.min(r1, r2));
	}
}