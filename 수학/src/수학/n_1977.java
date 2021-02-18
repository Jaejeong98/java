package ¼öÇÐ;

import java.util.*;

public class n_1977 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int M=sc.nextInt(), N=sc.nextInt();
		int sum=0, min=10000;
		for(int i=(int)Math.sqrt(M); i<=(int)Math.sqrt(N); i++) {
			if(M>i*i||i*i>N)
				continue;
			sum+=i*i;
			if(min>i*i)
				min=i*i;
		}
		if(sum==0)
			System.out.println(-1);
		else
			System.out.println(sum+"\n"+min);
	}
}
