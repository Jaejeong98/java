package 기본수학2;

import java.util.*;

public class n_1929 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int M=sc.nextInt(), N=sc.nextInt();
		for(; M<=N; M++) {
			int count=0;
			int root=(int)Math.sqrt(M);
			if(N==1)
				count++;
			for(int i=2; i<=root; i++) {
				if(M%i==0) {
					count++;
					break;
				}
			}
			if(count==0)
				System.out.println(M);
		}
	}
}
