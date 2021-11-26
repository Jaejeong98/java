package ¼öÇÐp3;

import java.io.*;

public class n_11312 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			String st[]=br.readLine().split(" ");
			long n1=Long.parseLong(st[0]), n2=Long.parseLong(st[1]), r=(long)Math.pow(n1/n2,2);
			bw.write(r+"\n");
		}
		bw.flush();bw.close();
	}
}