package ¹®ÀÚ¿­;

import java.io.*;

public class n_11586{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		String arr[][]=new String[T][T];
		for(int i=0; i<T; i++) {
			String st[]=br.readLine().split("");
			for(int j=0; j<T; j++)
				arr[i][j]=st[j];
		}
		int c=Integer.parseInt(br.readLine());
		if(c==1) {
			for(int i=0; i<T; i++) {
				for(int j=0; j<T; j++)
					bw.write(arr[i][j]);
				bw.write("\n");
			}
		}else if(c==2) {
			for(int i=0; i<T; i++) {
				for(int j=T-1; j>=0; j--)
					bw.write(arr[i][j]);
				bw.write("\n");
			}
		}else {
			for(int i=T-1; i>=0; i--) {
				for(int j=0; j<T; j++)
					bw.write(arr[i][j]);
				bw.write("\n");
			}
		}
		bw.flush();bw.close();
	}
}