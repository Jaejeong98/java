package ¼öÇĞ;

import java.util.*;

public class n_2455 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0, max=0;
		for(int i=0; i<4; i++) {
			int l=sc.nextInt(), r=sc.nextInt();
			sum+=r-l;
			if(max<sum)
				max=sum;
		}
		System.out.println(max);
	}
}
