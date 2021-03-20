package ¼öÇÐp2;

import java.io.*;

public class n_2399 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		long sum=0;
		String[] st=br.readLine().split(" ");
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++)
				sum+=Math.abs(Integer.parseInt(st[i])-Integer.parseInt(st[j]));
		}
		System.out.println(sum);
	}
}
