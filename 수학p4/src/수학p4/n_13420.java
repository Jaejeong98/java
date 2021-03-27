package ¼öÇÐp4;

import java.io.*;

public class n_13420 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			String[] st=br.readLine().split(" ");
			long num=0;
			if(st[1].charAt(0)=='+')
				num=Long.parseLong(st[0])+Long.parseLong(st[2]);
			if(st[1].charAt(0)=='-')
				num=Long.parseLong(st[0])-Long.parseLong(st[2]);
			if(st[1].charAt(0)=='*')
				num=Long.parseLong(st[0])*Long.parseLong(st[2]);
			if(st[1].charAt(0)=='/')
				num=Long.parseLong(st[0])/Long.parseLong(st[2]);
			if(num==Long.parseLong(st[4]))
				bw.write("correct\n");
			else
				bw.write("wrong answer\n");
		}
		bw.flush();
		bw.close();
	}
}
