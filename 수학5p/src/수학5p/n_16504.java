package ¼öÇÐ5p;

import java.io.*;

public class n_16504 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		long sum=0;
		for(int i=0; i<T; i++) {
			String[] st=br.readLine().split(" ");
			for(int j=0; j<T; j++)
				sum+=Integer.parseInt(st[j]);
		}
		System.out.println(sum);
	}
}
