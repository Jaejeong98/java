package ±¸Çö;

import java.io.*;

public class n_2669 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int arr[][]=new int[101][101], count=0;
		for(int i=0; i<4; i++) {
			String[] st=br.readLine().split(" ");
			int x1=Integer.parseInt(st[0]), y1=Integer.parseInt(st[1]);
			int x2=Integer.parseInt(st[2]),y2=Integer.parseInt(st[3]);
			for(int j=y1; j<y2; j++) {
				for(int k=x1; k<x2; k++)
					arr[k][j]++;
			}
		}
		for(int i=0; i<=100; i++) {
			for(int j=0; j<=100; j++) {
				if(arr[i][j]!=0)
					count++;
			}
		}
		System.out.println(count);
	}
}
