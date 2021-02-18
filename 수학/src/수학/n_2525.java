package ¼öÇÐ;

import java.util.*;

public class n_2525 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int H=sc.nextInt(), M=sc.nextInt(), T=sc.nextInt();
		H+=T/60;
		M+=T%60;
		if(M>=60) {
			H++;
			M-=60;
		}
		if(H>23)
			H-=24;
		System.out.println(H+" "+M);
	}
}
