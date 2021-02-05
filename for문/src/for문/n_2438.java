package for¹®;

import java.util.*;

public class n_2438 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		for(int j=1; j<=N; j++) {
			for(int i=0; i<j; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
