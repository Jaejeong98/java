package ±¸Çö2;

import java.io.*;

public class n_16926 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String st[]=br.readLine().split(" ");
		int n = Integer.parseInt(st[0]),m = Integer.parseInt(st[1]),r= Integer.parseInt(st[2]);
		int min = Math.min(n, m) / 2,arr[][] = new int[n][m];
		for(int i=0; i<n; i++) {
			String str[] =br.readLine().split(" "); 
			for(int j=0; j<m; j++)
				arr[i][j] = Integer.parseInt(str[j]);
		}
		for(int i=0; i<r; i++) { 
			for(int j=0; j<min; j++) {
				int num= arr[j][j]; 
				for(int k=j+1; k<m-j; k++)
					arr[j][k-1] = arr[j][k];
				for(int k=j+1; k<n-j; k++)
					arr[k-1][m-1-j] = arr[k][m-1-j];
				for(int k=m-2-j; k>=j; k--)
					arr[n-1-j][k+1] = arr[n-1-j][k];
				for(int k=n-2-j; k>=j; k--)
					arr[k+1][j] = arr[k][j];
				arr[j+1][j] = num;
			}
		}
		for(int j=0; j<n; j++) {
			for(int k=0; k<m; k++)
				bw.write(arr[j][k] + " ");
			bw.write("\n");
		}
		bw.flush();bw.close();
	}
}
