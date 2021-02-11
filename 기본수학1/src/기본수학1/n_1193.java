package 기본수학1;

import java.util.*;

public class n_1193 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int T=1, B=1, count=2;
		for(int i=2; i<=n; i++) {
			if(count%2==0) {
				if(T==1) {
					count++;
					B=count-1;
				}
				else {
					T--;
					B++;
				}
			}
				else {
					if(B==1) {
						count++;
						T=count-1;
					}
					else {
						T++;
						B--;
					}
				}
			
		}
		System.out.println(T+"/"+B);
	}
}