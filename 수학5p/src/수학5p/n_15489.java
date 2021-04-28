package ¼öÇĞ5p;

import java.util.*;

public class n_15489 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[3], arr2[][]=new int[31][31];
		for(int i=0; i<3; i++)
			arr[i]=sc.nextInt();
		arr2[1][1]=1;
		for(int i=1; i<=30; i++) {
			for(int j=1; j<=i; j++) {
				if(j==1||j==i)
					arr2[i][j]=1;
				else
					arr2[i][j]=arr2[i-1][j]+arr2[i-1][j-1];
			}
		}
		int sum=0;
		for(int i=0; i<arr[2]; i++) {
			for(int j=0; j<i+1; j++)
				sum+=arr2[i+arr[0]][j+arr[1]];
		}
		System.out.println(sum);
	}
}
