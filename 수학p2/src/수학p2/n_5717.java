package ¼öÇÐp2;

import java.io.*;

public class n_5717 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		while(true) {
			String[] st=br.readLine().split(" ");
			if(Integer.parseInt(st[0])==0&&Integer.parseInt(st[1])==0)
				break;
			bw.write((Integer.parseInt(st[0])+Integer.parseInt(st[1]))+"\n");
		}
		bw.flush();
		bw.close();
	}
}
