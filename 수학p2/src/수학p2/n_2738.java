package ¼öÇÐp2;

import java.io.*;

public class n_2738 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String[] st=br.readLine().split(" ");
		int N=Integer.parseInt(st[0]), M=Integer.parseInt(st[1]);
		int[][] arr=new int[N][M];
		for(int i=0; i<N*2; i++) {
			String[] str=br.readLine().split(" ");
			for(int j=0; j<M;j++)
				arr[i%N][j]+=Integer.parseInt(str[j]);
		}
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++)
				bw.write(arr[i][j]+" ");
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}
}
