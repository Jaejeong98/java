package ¼öÇÐ5p;

import java.io.*;

public class n_9713 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			int num=Integer.parseInt(br.readLine());
			int sum=0;
			for(int j=1; j<=num; j++) {
				if(j%2==1)
					sum+=j;
			}
			bw.write(sum+"\n");
		}
		bw.flush();
		bw.close();
	}
}
