package ¹®ÀÚ¿­;

import java.io.*;

public class n_9093 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			String[]st=br.readLine().split(" ");
			for(int j=0; j<st.length; j++) {
				String[] st1=st[j].split("");
				for(int k=st1.length-1; k>=0; k--)
					bw.write(st1[k]);
				bw.write(" ");
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}
}
