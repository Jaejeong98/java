package ¹®ÀÚ¿­;

import java.io.*;

public class n_5026 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			String st=br.readLine();
			if(st.contains("+")) {
				String[] string=st.split("\\+");
				bw.write(Integer.parseInt(string[0])+Integer.parseInt(string[1])+"\n");
			}else
				bw.write("skipped\n");
		}
		bw.flush();bw.close();
	}
}
