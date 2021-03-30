package ¼öÇÐp4;

import java.io.*;

public class n_2721 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		int[] arr=new int[302];
		for(int j=1; j<=301; j++)
			arr[j]=arr[j-1]+j;
		for(int i=0; i<T; i++) {
			int num=Integer.parseInt(br.readLine()), sum=0;
			for(int j=1; j<=num; j++)
				sum+=j*arr[j+1];
			bw.write(sum+"\n");
		}
		bw.flush();
		bw.close();
	}
}
