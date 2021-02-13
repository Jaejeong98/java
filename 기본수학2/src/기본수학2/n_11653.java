package 기본수학2;

import java.util.*;

public class n_11653 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int i=2;
		while(N!=1) {
			if(N%i==0) {
				N=N/i;
				System.out.println(i);
			}
			else
				i++;
		}
	}
}
