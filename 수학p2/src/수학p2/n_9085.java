package ¼öÇÐp2;

import java.io.*;

public class n_9085 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			int n=Integer.parseInt(br.readLine()), sum=0;
			String[] st=br.readLine().split(" ");
			for(int j=0; j<n; j++)
				sum+=Integer.parseInt(st[j]);
			System.out.println(sum);
		}
	}
}
