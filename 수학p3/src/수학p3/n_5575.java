package ¼öÇÐp3;

import java.io.*;

public class n_5575 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i=0;i<3;i++) {
			String[] st=br.readLine().split(" ");
			int s=Integer.parseInt(st[5])-Integer.parseInt(st[2]);
			int m=Integer.parseInt(st[4])-Integer.parseInt(st[1]);
			int h=Integer.parseInt(st[3])-Integer.parseInt(st[0]);
			if(s<0) {
				m--; s+=60;
			}
			if(m<0) {
				h--; m+=60;
			}
			bw.write(h+" "+m+" "+s+"\n");
		}
		bw.flush();
		bw.close();
	}
}
