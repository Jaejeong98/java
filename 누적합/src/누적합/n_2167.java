package ДЉРћЧе;

import java.io.*;
import java.util.*;

public class n_2167 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num1=Integer.parseInt(st.nextToken()), num2=Integer.parseInt(st.nextToken());
		int arr[][]=new int[num1][num2];
		for(int i=0; i<num1; i++) {
			st=new StringTokenizer(br.readLine());
			for(int j=0; j<num2; j++)
				arr[i][j]=Integer.parseInt(st.nextToken());
		}
		int T=Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			st=new StringTokenizer(br.readLine());
			int sum=0, j=Integer.parseInt(st.nextToken()),k=Integer.parseInt(st.nextToken());
			int x=Integer.parseInt(st.nextToken()), y=Integer.parseInt(st.nextToken());
			for(int m=j-1; m<x; m++) {
				for(int n=k-1; n<y; n++)
					sum+=arr[m][n];
			}
			bw.write(sum+"\n");
		}
		bw.flush();bw.close();
	}
}
