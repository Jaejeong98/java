package ±¸Çö2;

import java.io.*;
import java.util.Arrays;

public class n_17263 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine()), arr[]=new int[T];
		String st[]=br.readLine().split(" ");
		for(int i=0; i<T; i++)
			arr[i]=Integer.parseInt(st[i]);
		Arrays.sort(arr);
		System.out.println(arr[T-1]);
	}
}
