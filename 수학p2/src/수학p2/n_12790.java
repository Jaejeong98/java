package ¼öÇÐp2;

import java.io.*;

public class n_12790 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			String[] st=br.readLine().split(" ");
			int HP=Math.max(Integer.parseInt(st[0])+Integer.parseInt(st[4]),1);
			int MP=Math.max(Integer.parseInt(st[1])+Integer.parseInt(st[5]),1);
			int OF=Math.max(Integer.parseInt(st[2])+Integer.parseInt(st[6]),0);
			int DE=Integer.parseInt(st[3])+Integer.parseInt(st[7]);
			System.out.println(HP+5*MP+2*OF+2*DE);
		}
	}
}
