package ¼öÇÐp2;

import java.io.*;

public class n_3460 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			int num=Integer.parseInt(br.readLine());
			String bi=Integer.toBinaryString(num);
			for(int j=bi.length()-1; j>=0; j--) {
				if(bi.charAt(j)=='1')
					bw.write((bi.length()-1-j)+" ");
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}
}
