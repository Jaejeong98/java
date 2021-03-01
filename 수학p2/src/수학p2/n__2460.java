package ¼öÇĞp2;

import java.util.*;

public class n__2460 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0, max=0;
		for(int i=0; i<10; i++) {
			int l=sc.nextInt(), a=sc.nextInt();
			sum+=(a-l);
			if(max<sum)
				max=sum;
		}
		System.out.println(max);
	}
}
