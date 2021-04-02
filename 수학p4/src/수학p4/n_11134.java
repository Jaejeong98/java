package ¼öÇÐp4;

import java.io.*;

public class n_11134 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			String[] st=br.readLine().split(" ");
			double num1=Integer.parseInt(st[0]), num2=Integer.parseInt(st[1]);
			bw.write((int)Math.ceil(num1/num2)+"\n");
		}
		bw.flush();
		bw.close();
	}
}
