package ¼öÇÐp2;

import java.util.*;

public class n_2530 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int H=sc.nextInt(), M=sc.nextInt(), S=sc.nextInt(), T=sc.nextInt();
		H+=T/3600;
		M+=(T%3600)/60;
		S+=(T%3600)%60;
		if(S>=60) {
			M+=S/60;
			S%=60;
		}
		if(M>=60) {
			H+=M/60;
			M%=60;
		}
		if(H>=24)
			H%=24;
		System.out.println(H+" "+M+" "+S);
	}
}
