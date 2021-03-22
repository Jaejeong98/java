package ¼öÇÐp3;

import java.io.*;

public class n_10419 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			int num=Integer.parseInt(br.readLine()), t=1;
			while(t+t*t<=num)
					t++;
			bw.write(t-1+"\n");
		}
		bw.flush();
		bw.close();
	}
}