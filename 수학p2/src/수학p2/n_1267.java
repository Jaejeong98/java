package ¼öÇÐp2;

import java.util.*;

public class n_1267 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(), Y=0, M=0;
		for(int i=0; i<n; i++) {
			int num=sc.nextInt();
			Y+=(num/30+1)*10;
			M+=(num/60+1)*15;
		}
		if(Y>M)
			System.out.println("M "+M);
		else if(Y==M)
			System.out.println("Y M "+Y);
		else
			System.out.println("Y "+Y);
	}
}
