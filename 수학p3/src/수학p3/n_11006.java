package ¼öÇÐp3;

import java.io.*;

public class n_11006 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			String[] st=br.readLine().split(" ");
			int n=Integer.parseInt(st[0]), m=Integer.parseInt(st[1]);
			bw.write((2*m-n)+" "+(-m+n)+"\n");
		}
		bw.flush();
		bw.close();
	}
}
