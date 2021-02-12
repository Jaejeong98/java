package 기본수학1;

import java.util.*;

public class n_2775 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=0; i<T; i++) {
			int k=sc.nextInt(), n=sc.nextInt();
			int array[][]=new int[k+1][n+1];
			for(int j=0; j<=k; j++) {
				array[j][1]=1;
				for(int o=1; o<=n; o++) {
					if(j==0)
						array[0][o]=o;
					else
						array[j][o]=array[j-1][o]+array[j][o-1];
				}
			}
			System.out.println(array[k][n]);
		}
	}
}
