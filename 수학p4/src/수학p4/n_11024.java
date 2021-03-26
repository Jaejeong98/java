package ¼öÇÐp4;

import java.io.*;

public class n_11024 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			String[] st=br.readLine().split(" ");
			int sum=0;
			for(int j=0; j<st.length; j++)
				sum+=Integer.parseInt(st[j]);
			bw.write(sum+"\n");
		}
		bw.flush();
		bw.close();
	}
}
