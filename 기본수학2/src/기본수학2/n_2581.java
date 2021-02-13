package 기본수학2;

import java.util.*;
import java.io.*;

public class n_2581 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int M=sc.nextInt(), N=sc.nextInt();
		int sum=0, min=0;
		for(;M<=N; M++) {
			int prime=0;
			for(int i=1;i<=N;i++) {
				if(M%i==0)
					prime++;
			}
			if(prime==2) {
				if(min==0)
					min=M;
				sum+=min;
			}
		}
		if(sum==0)
			System.out.println(-1);
		else
			System.out.println(sum+"\n"+min);
	}
}
