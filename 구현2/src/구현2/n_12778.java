package ±¸Çö2;

import java.io.*;

public class n_12778 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			String st[]=br.readLine().split(" "), st2[]=br.readLine().split(" ");
			if(st[1].equals("C")) {
				for(int j=0; j<Integer.parseInt(st[0]); j++) {
					char ch=st2[j].charAt(0);
					bw.write((ch-65+1)+" ");
				}
				bw.write("\n");
			}else {
				for(int j=0; j<Integer.parseInt(st[0]); j++)
					bw.write((char)(Integer.parseInt(st2[j])+64)+" ");
				bw.write("\n");
			}
		}
		bw.flush();bw.close();
	}
}