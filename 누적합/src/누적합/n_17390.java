package ДЉРћЧе;

import java.io.*;
import java.util.Arrays;

public class n_17390 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String st[]=br.readLine().split(" "), st2[]=br.readLine().split(" ");
		int arr[]=new int[Integer.parseInt(st[0])+1];
		for(int i=1; i<arr.length; i++)
			arr[i]=Integer.parseInt(st2[i-1]);
		Arrays.sort(arr);
		for(int i=1; i<arr.length; i++)
			arr[i]+=arr[i-1];
		for(int i=0; i<Integer.parseInt(st[1]); i++) {
			String str[]=br.readLine().split(" ");
			bw.write(arr[Integer.parseInt(str[1])]-arr[Integer.parseInt(str[0])-1]+"\n");
		}
		bw.flush();bw.close();
	}
}