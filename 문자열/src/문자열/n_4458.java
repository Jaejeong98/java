package ¹®ÀÚ¿­;

import java.io.*;

public class n_4458 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			String st=br.readLine();
			for(int j=0; j<st.length(); j++) {
				if(j==0) {
					if(st.charAt(j)>=97&&st.charAt(j)<=123)
						bw.write((int)(st.charAt(j)-32));
					else
						bw.write(st.charAt(j));
				}
				else
					bw.write(st.charAt(j));
			}
			bw.write("\n");
		}
		bw.flush();bw.close();
	}
}
