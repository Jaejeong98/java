package ±¸Çö3;

import java.io.*;

public class n_10874 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			String st[]=br.readLine().split(" ");
			boolean b=false;
			for(int j=0; j<st.length; j++) {
				if(j%5+1!=Integer.parseInt(st[j])) {
					b=true; break;
				}
			}
			if(!b) bw.write((i+1)+"\n");
		}
		bw.flush();bw.close();
	}
}
