package ¹®ÀÚ¿­;

import java.io.*;

public class n_2711 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			String[] st=br.readLine().split(" ");
			String s=new String();
			for(int j=0; j<st[1].length(); j++) {
				if(j+1==Integer.parseInt(st[0]))
					continue;
				else
					s+=st[1].charAt(j);
			}
			bw.write(s+"\n");
		}
		bw.flush();bw.close();
	}
}
