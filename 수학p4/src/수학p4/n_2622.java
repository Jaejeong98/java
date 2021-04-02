package ¼öÇÐp4;

import java.util.*;

public class n_2622 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt(), count=0;
		for(int i=1; i<num; i++) {
			for(int j=i; j<num; j++) {
				int c=num-(i+j);
				if(c<j)
					break;
				if(i+j>c)
					count++;
			}
		}
		System.out.println(count);
	}
}
