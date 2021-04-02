package ¼öÇÐp4;

import java.io.*;

public class n_18247 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			String[] st=br.readLine().split(" ");
			int num1=Integer.parseInt(st[0]), num2=Integer.parseInt(st[1]);
			if(num1<12||num2<4)
				bw.write(-1+"\n");
			else {
				bw.write(11*num2+4+"\n");
			}
		}
		bw.flush();
		bw.close();
	}
}
