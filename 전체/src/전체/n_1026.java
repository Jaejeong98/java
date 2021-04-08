package ÀüÃ¼;

import java.io.*;
import java.util.Arrays;

public class n_1026 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine()), sum=0;
		String[] st=br.readLine().split(" "), st1=br.readLine().split(" ");
		int[] arr1=new int[T], arr2=new int[T];
		for(int i=0; i<T; i++) {
			arr1[i]=Integer.parseInt(st[i]);
			arr2[i]=Integer.parseInt(st1[i]);
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		for(int i=0; i<T; i++)
			sum+=arr1[i]*arr2[T-i-1];
		System.out.println(sum);
	}
}
