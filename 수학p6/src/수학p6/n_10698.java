package ¼öÇÐp6;

import java.io.*;

public class n_10698 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			String[] st=br.readLine().split(" ");
			int num=0;
			if(st[1].equals("+")==true)
				num=Integer.parseInt(st[0])+Integer.parseInt(st[2]);
			else {
				num=Integer.parseInt(st[0])-Integer.parseInt(st[2]);
			}
			if(Integer.parseInt(st[4])==num)
				bw.write("Case "+(i+1)+": YES\n");
			else
				bw.write("Case "+(i+1)+": NO\n");
		}
		bw.flush();
		bw.close();
	}
}
