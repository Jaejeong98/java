package ±¸Çö2;

import java.io.*;

public class n_9286 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int t=Integer.parseInt(br.readLine());
		for(int i=0; i<t; i++) {
			int c=Integer.parseInt(br.readLine());
			bw.write("Case "+(i+1)+":\n");
			for(int j=0; j<c; j++) {
				int g=Integer.parseInt(br.readLine());
				if(g>=6)continue;
				else bw.write(g+1+"\n");
			}
		}
		bw.flush();bw.close();
	}
}