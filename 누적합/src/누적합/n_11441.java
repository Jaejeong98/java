package ДЉРћЧе;

import java.io.*;

public class n_11441 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine()), arr[]=new int[T+1];
		String st[]=br.readLine().split(" ");
		for(int i=1; i<=T; i++)
			arr[i]=Integer.parseInt(st[i-1])+arr[i-1];
		int C=Integer.parseInt(br.readLine());
		for(int i=0; i<C; i++) {
			String str[]=br.readLine().split(" ");
			bw.write(arr[Integer.parseInt(str[1])]-arr[Integer.parseInt(str[0])-1]+"\n");
		}
		bw.flush();
		bw.close();
	}
}
