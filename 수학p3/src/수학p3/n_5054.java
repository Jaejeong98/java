package ¼öÇÐp3;

import java.io.*;
import java.util.Arrays;

public class n_5054 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			int n=Integer.parseInt(br.readLine()), arr[]=new int[n];
			String[] st=br.readLine().split(" ");
			for(int j=0; j<n; j++)
				arr[j]=Integer.parseInt(st[j]);
			Arrays.sort(arr);
			bw.write((arr[n-1]-arr[0])*2+"\n");
		}
		bw.flush();
		bw.close();
	}
}
