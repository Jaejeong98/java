package ¼öÇÐ5p;

import java.io.*;

public class n_16208 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		long arr[]=new long[T], length=0, result=0;
		String[] st=br.readLine().split(" ");
		for(int i=0; i<T;i++) {
			arr[i]=Integer.parseInt(st[i]);
			length+=Integer.parseInt(st[i]);
		}
		for(int i=0; i<T; i++) {
			length-=arr[i];
			result+=arr[i]*length;
		}
		System.out.println(result);
	}
}
