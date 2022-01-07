package 플로이드_와샬;

import java.io.*;

public class n_11403 {
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine()), arr[][]=new int[T][T];
		for(int i=0; i<T; i++) {
			String st[]=br.readLine().split(" ");
			for(int j=0; j<T; j++)
				arr[i][j]=Integer.parseInt(st[j]);
		}
		for(int i=0; i<T; i++) {
			for(int j=0; j<T; j++) {
				for(int k=0; k<T; k++) {
					if(arr[j][i]==1&&arr[i][k]==1) arr[j][k]=1;
				}
			}
		}
		for(int i=0; i<T; i++) {
			for(int j=0; j<T; j++)
				bw.write(arr[i][j]+" ");
			bw.write("\n");
		}
		bw.flush();bw.close();
	}
}
