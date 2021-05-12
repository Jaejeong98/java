package ДЉРћЧе;

import java.io.*;

public class n_11659 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String[] st=br.readLine().split(" "), st2=br.readLine().split(" ");
		int arr[]=new int[Integer.parseInt(st[0])+1];
		for(int i=1; i<=Integer.parseInt(st[0]); i++)
				arr[i]=Integer.parseInt(st2[i-1])+arr[i-1];
		for(int i=0; i<Integer.parseInt(st[1]); i++) {
			String[] st3=br.readLine().split(" ");
			bw.write(arr[Integer.parseInt(st3[1])]-arr[Integer.parseInt(st3[0])-1]+"\n");
		}
		bw.flush();bw.close();
	}
}