package ±¸Çö2;

import java.io.*;

public class n_10813 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String st[]=br.readLine().split(" ");
		int T=Integer.parseInt(st[1]), arr[]=new int[Integer.parseInt(st[0])+1];
		for(int i=1; i<Integer.parseInt(st[0])+1; i++)
			arr[i]=i;
		for(int i=0; i<T; i++) {
			String str[]=br.readLine().split(" ");
			int num=arr[Integer.parseInt(str[0])];
			arr[Integer.parseInt(str[0])]=arr[Integer.parseInt(str[1])];
			arr[Integer.parseInt(str[1])]=num;
		}
		for(int i=1; i<Integer.parseInt(st[0])+1; i++)
			System.out.print(arr[i]+" ");
	}
}
