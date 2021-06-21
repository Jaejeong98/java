package ¹®ÀÚ¿­;

import java.io.*;

public class n_9086 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			String st=br.readLine();
			int length=st.length()-1;
			bw.write(st.charAt(0)+""+st.charAt(length)+"\n");
		}
		bw.flush();bw.close();
	}
}
