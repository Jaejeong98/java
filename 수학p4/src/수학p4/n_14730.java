package ¼öÇÐp4;

import java.io.*;

public class n_14730 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine()), sum=0;
		for(int i=0; i<T; i++) {
			String st[]=br.readLine().split(" ");
			sum+=Integer.parseInt(st[0])*Integer.parseInt(st[1]);
		}
		System.out.println(sum);
	}
}
