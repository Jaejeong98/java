package ¼öÇÐp4;

import java.io.*;

public class n_10599 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		while(true) {
			String[] st=br.readLine().split(" ");
			if(st[0].equals("0")&&st[1].equals("0")&&st[2].equals("0")&&st[3].equals("0"))
				break;
			bw.write(Math.abs(Integer.parseInt(st[2])-Integer.parseInt(st[1]))+" "+
				Math.abs(Integer.parseInt(st[3])-Integer.parseInt(st[0]))+"\n");
		}
		bw.flush();
		bw.close();
	}
}
