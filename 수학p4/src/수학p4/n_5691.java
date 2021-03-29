package ¼öÇÐp4;

import java.io.*;

public class n_5691 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		while(true) {
			String[] st=br.readLine().split(" ");
			if(st[0].equals("0")&&st[1].equals("0"))
				break;
			bw.write(Integer.parseInt(st[0])*2-Integer.parseInt(st[1])+"\n");
		}
		bw.flush();
		bw.close();
	}
}
