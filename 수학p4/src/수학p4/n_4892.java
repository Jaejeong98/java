package ¼öÇÐp4;

import java.io.*;

public class n_4892 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int i=0;
		while(true) {
			int n0=Integer.parseInt(br.readLine());
			i++;
			if(n0==0)
				break;
			int n1=n0*3;
			if(n1%2==0) {
				bw.write(i+". even "+(n1/2)*3/9+"\n");
			}
			else {
				bw.write(i+". odd "+(n1+1)/2*3/9+"\n");
			}
		}
		bw.flush();
		bw.close();
	}
}
