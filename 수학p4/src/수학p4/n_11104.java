package ¼öÇÐp4;

import java.io.*;

public class n_11104 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			String[] st=br.readLine().split("");
			int sum=0;
			for(int j=st.length-1; j>=0;j--) {
				if(st[j].equals("1"))
					sum+=Math.pow(2, st.length-1-j);
			}
			bw.write((int)sum+"\n");
		}
		bw.flush();
		bw.close();
	}
}
