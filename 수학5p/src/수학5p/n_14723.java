package ¼öÇÐ5p;

import java.util.*;

public class n_14723 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt(), count=1, T=1, B=1;
		while(num!=count) {
			if(T==1) {
				T=B+1; B=1;
			}
			else {
				T--;B++;
			}
			count++;
		}
		System.out.println(T+" "+B);
	}
}
