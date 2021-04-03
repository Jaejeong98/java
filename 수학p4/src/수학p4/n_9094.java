package ¼öÇÐp4;

import java.io.*;

public class n_9094 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			String[] st=br.readLine().split(" ");
			int num1=Integer.parseInt(st[0]), num2=Integer.parseInt(st[1]), count=0;
			for(int j=1; j<num1; j++) {
				for(int k=j+1; k<num1; k++) {
					if(((j*j+k*k+num2)%(j*k))==0)
						count++;
				}
			}
			bw.write(count+"\n");
		}
		bw.flush();
		bw.close();
	}
}
