package 다이나믹_프로그래밍p1;

import java.math.BigInteger;
import java.util.*;

public class n_2407 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt(), num2=sc.nextInt();
		BigInteger arr[][]=new BigInteger[101][101];
		arr[1][0]=arr[1][1]=BigInteger.valueOf(1);
		for(int i=2; i<=100; i++) {
			for(int j=0; j<=i; j++) {
				if(j==0||j==i) 
					arr[i][j]=BigInteger.valueOf(1);
				else 
					arr[i][j]=arr[i-1][j].add(arr[i-1][j-1]);
			}
		}
		System.out.println(arr[num1][num2]);
	}
}