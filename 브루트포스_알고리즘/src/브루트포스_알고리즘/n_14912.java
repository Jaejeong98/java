package 브루트포스_알고리즘;

import java.util.*;

public class n_14912 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt(), n2=sc.nextInt(), count=0;
		for(int i=1; i<=n1; i++) {
			int n=i;
			while(n>0) {
				if(n%10==n2) count++;
				n/=10;
			}
		}
		System.out.println(count);
	}
}