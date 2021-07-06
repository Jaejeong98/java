package 브루트포스_알고리즘;

import java.util.*;

public class n_6131 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt(), count=0;
		for(int i=1; i<=500; i++) {
			for(int j=i; j<=500; j++) {
				if(i*i+num==j*j)
					count++;
			}
		}
		System.out.println(count);
	}
}
