package ¼öÇÐp4;

import java.io.*;

public class n_1731 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine()), arr[]=new int[T];
		for(int i=0; i<T;i++) 
			arr[i]=Integer.parseInt(br.readLine());
		if(arr[2]-arr[1]==arr[1]-arr[0])
			System.out.println(arr[T-1]+(arr[1]-arr[0]));
		else
			System.out.println(arr[T-1]*(arr[1]/arr[0]));
	}
}
