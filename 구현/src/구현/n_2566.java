package ±¸Çö;

import java.io.*;

public class n_2566 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int arr[][]=new int[10][10], max=0, x=0, y=0;
		for(int i=0; i<9; i++) {
			String st[]=br.readLine().split(" ");
			for(int j=0; j<9; j++) {
				arr[i+1][j+1]=Integer.parseInt(st[j]);
				if(max<arr[i+1][j+1]) {
					max=arr[i+1][j+1];
					x=i+1;
					y=j+1;
				}
			}
		}
		System.out.println(max+"\n"+x+" "+y);
	}
}