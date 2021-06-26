package ±¸Çö2;

import java.io.*;

public class n_13752 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			int num=Integer.parseInt(br.readLine());
			for(int j=0; j<num; j++)
				bw.write("=");
			bw.write("\n");
		}
		bw.flush();bw.close();
	}
}
