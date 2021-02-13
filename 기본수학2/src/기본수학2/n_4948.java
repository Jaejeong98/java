package 기본수학2;

import java.util.*;

public class n_4948 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		while(true) {
			int n=sc.nextInt();
			if(n==0)
				break;
			for(int i=n+1; i<=2*n; i++) {
				int prime=0;
				int root=(int)Math.sqrt(i);
				if(i==1)
					prime++;
				for(int j=2; j<=root; j++) {
					if(i%j==0) {
						prime++;
						break;
					}
				}
				if(prime==0)
					count++;
			}
			System.out.println(count);
		}
	}
}
