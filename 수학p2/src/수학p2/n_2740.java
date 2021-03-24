package ¼öÇÐp2;

import java.io.*;

public class n_2740 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String[] st1=br.readLine().split(" ");
		int[][] arr1=new int[Integer.parseInt(st1[0])][Integer.parseInt(st1[1])];
		for(int i=0; i<Integer.parseInt(st1[0]); i++) {
			String[] st=br.readLine().split(" ");
			for(int j=0; j<Integer.parseInt(st1[1]); j++)
				arr1[i][j]=Integer.parseInt(st[j]);
		}
		String[] st2=br.readLine().split(" ");
		int[][] arr2=new int[Integer.parseInt(st2[0])][Integer.parseInt(st2[1])];
		for(int i=0; i<Integer.parseInt(st2[0]); i++) {
			String[] st=br.readLine().split(" ");
			for(int j=0; j<Integer.parseInt(st2[1]); j++)
				arr2[i][j]=Integer.parseInt(st[j]);
		}
		for(int i=0; i<Integer.parseInt(st1[0]); i++) {
			for(int j=0; j<Integer.parseInt(st2[1]); j++) {
				int sum=0;
				for(int k=0; k<Integer.parseInt(st2[0]); k++)
					sum+=arr1[i][k]*arr2[k][j];
				bw.write(sum+" ");
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
    }
}