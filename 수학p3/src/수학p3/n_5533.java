package ¼öÇÐp3;

import java.io.*;

public class n_5533 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		int[][] num=new int[T][3];
		int[] arr=new int[T];
		boolean same;
		for(int i=0; i<T; i++) {
			String[] st=br.readLine().split(" ");
			for(int j=0; j<3; j++)
				num[i][j]=Integer.parseInt(st[j]);
		}
		for(int i=0; i<T; i++) {
			for(int j=0; j<3; j++) {
				same=false;
				for(int n=0; n<T; n++) {
					if(i==n)continue;
					else if(num[i][j]==num[n][j]) {
						num[n][j]=0;
						same=true;
					}
				}
				if(same==true)num[i][j]=0;
				else arr[i]+=num[i][j];
			}
		}
		for(int j=0; j<T; j++)
			bw.write(arr[j]+"\n");
		bw.flush();
		bw.close();
	}
}
