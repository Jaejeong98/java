package ±¸Çö2;

import java.io.*;

public class n_8741 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int num=Integer.parseInt(br.readLine());
		for(int i=0; i<num; i++)
			bw.write("1");
		for(int i=0; i<num-1; i++)
			bw.write("0");
		bw.flush();bw.close();
	}
}