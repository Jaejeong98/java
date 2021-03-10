package ¼öÇÐp3;

import java.io.*;

public class n_10178 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			String[] st=br.readLine().split(" ");
			int c=Integer.parseInt(st[0]), v=Integer.parseInt(st[1]);
			bw.write("You get "+c/v+" piece(s) and your dad gets "+c%v+" piece(s).\n");
		}
		bw.flush();
		bw.close();
	}
}
