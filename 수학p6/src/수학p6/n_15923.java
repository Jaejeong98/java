package ¼öÇÐp6;

import java.io.*;

public class n_15923 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine()), sum=0, arr[][]=new int[T][T];
		for(int i=0; i<T; i++) {
			String[] st=br.readLine().split(" ");
			for(int j=0; j<2; j++)
				arr[i][j]=Integer.parseInt(st[j]);
		}
		for(int i=0; i<T; i++) {
			if(i==T-1)
				sum+=(int)Math.sqrt(Math.pow(arr[i][0]-arr[0][0], 2)+Math.pow(arr[i][1]-arr[0][1], 2));
			else
				sum+=(int)Math.sqrt(Math.pow(arr[i][0]-arr[i+1][0], 2)+Math.pow(arr[i][1]-arr[i+1][1], 2));
		}
		System.out.println(sum);
	}
}
