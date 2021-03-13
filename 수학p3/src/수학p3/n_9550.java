package ¼öÇÐp3;

import java.io.*;

public class n_9550 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			String[] st=br.readLine().split(" ");
			int n1=Integer.parseInt(st[0]),n2=Integer.parseInt(st[1]), sum=0;
			String[] st1=br.readLine().split(" ");
			for(int j=0; j<n1; j++) {
				sum+=Integer.parseInt(st1[j])/n2;
			}
			bw.write(sum+"\n");
		}
		bw.flush();
		bw.close();
	}
}
