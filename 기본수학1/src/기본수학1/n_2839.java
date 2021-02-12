package 기본수학1;

import java.util.*;

public class n_2839 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt(), result=0;
		for(int i=0; i<1667; i++) {
			for(int j=0; j<1001; j++) {
				if(N==3*i+5*j) {
					if(result==0||result>i+j)
						result=i+j;
				}
			}
		}
		if(result==0)
			System.out.println(-1);
		else
			System.out.println(result);
	}
}
