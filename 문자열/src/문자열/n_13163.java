package ¹®ÀÚ¿­;

import java.io.*;

public class n_13163 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			String st[]=br.readLine().split(" ");
			bw.write("god");
			for(int j=1; j<st.length; j++)
				bw.write(st[j]);
			bw.write("\n");
		}
		bw.flush();bw.close();
	}
}
