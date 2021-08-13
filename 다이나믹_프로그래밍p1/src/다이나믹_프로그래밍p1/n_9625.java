package 다이나믹_프로그래밍p1;

import java.util.*;

public class n_9625 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt(), n1=1, n2=0;
		for(int i=0; i<T; i++) {
			int temp=n1+n2;
			n1=n2;
			n2=temp;
		}
		System.out.println(n1+" "+n2);
	}
}
