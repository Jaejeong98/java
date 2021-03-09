package ¼öÇÐp2;

import java.io.*;

public class n_10539 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine()), sum=0;
		String[] st=br.readLine().split(" ");
		for(int i=0; i<n;i++) {
			int num=Integer.parseInt(st[i])*(i+1)-sum;
			bw.write(num+" ");
			sum+=num;
		}
		bw.flush();
		bw.close();
	}
}
