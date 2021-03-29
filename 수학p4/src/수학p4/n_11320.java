package ¼öÇÐp4;

import java.io.*;

public class n_11320 {
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			String[] st=br.readLine().split(" ");
			int num=(int)Math.ceil(Integer.parseInt(st[0])/Integer.parseInt(st[1])), sum=0;
			for(int j=1; j<=num; j++)
				sum+=j*2-1;
			bw.write(sum+"\n");
		}
		bw.flush();
		bw.close();
	}
}
