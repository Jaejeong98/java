package 기본수학1;

import java.util.*;

public class n_1978 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		int N=sc.nextInt();
		for(int i=0; i<N; i++) {
			int num=sc.nextInt();
			int prime=0;
			for(int j=1; j<=num; j++) {
				if(num%j==0)
					prime++;
			}
			if(prime==2)
				count++;
		}
		System.out.println(count);
	}
}
