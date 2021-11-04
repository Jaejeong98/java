package ±¸Çö2;

import java.io.*;

public class n_17363 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String st[]=br.readLine().split(" ");
		int n1=Integer.parseInt(st[0]), n2=Integer.parseInt(st[1]);
		char arr[][]=new char[n2][n1];
		for(int i=0; i<n1; i++) {
			String st2=br.readLine();
			for(int j=0; j<n2; j++) {
				int ch=st2.charAt(j);
				switch(ch) {
				case 45: ch=124; break;
				case 124: ch=45; break;
				case 47: ch=92; break;
				case 92: ch=47; break;
				case 94: ch=60; break;
				case 60: ch=118; break;
				case 118: ch=62; break;
				case 62: ch=94; break;
				}
				arr[j][i]=(char)ch;
			}
		}
		for(int i=n2-1; i>=0; i--) {
			for(int j=0; j<n1; j++)
				bw.write(arr[i][j]);
			bw.write("\n");
		}
		bw.flush();bw.close();
	}
}