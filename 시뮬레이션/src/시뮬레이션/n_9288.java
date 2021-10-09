package 시뮬레이션;

import java.util.*;

public class n_9288 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=0; i<T; i++) {
			int num=sc.nextInt(), d1=1;
			System.out.println("Case "+(i+1)+":");
			for(int j=1; j<=6;j++) {
				for(int k=j; k<=6; k++) {
					if(j+k==num) System.out.println("("+j+","+k+")");
				}
			}
		}
	}
}