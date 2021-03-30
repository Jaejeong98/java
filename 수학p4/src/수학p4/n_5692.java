package ¼öÇÐp4;

import java.io.*;

public class n_5692 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		while(true) {
			String[] st=br.readLine().split("");
			if(st[0].charAt(0)=='0')
				break;
			int sum=0;
			for(int i=0; i<st.length; i++) {
				int fac=1;
				for(int j=1; j<=st.length-i; j++)
					fac*=j;
				sum+=Integer.parseInt(st[i])*fac;
			}
			bw.write(sum+"\n");
		}
		bw.flush();
		bw.close();
	}
}
