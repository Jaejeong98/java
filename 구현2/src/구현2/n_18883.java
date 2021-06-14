package ±¸Çö2;

import java.io.*;

public class n_18883 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String st[]=br.readLine().split(" ");
		int n=Integer.parseInt(st[0]), m=Integer.parseInt(st[1]), count=1;
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				bw.write(count+++"");
				if((m-1)!=j)
					bw.write(" ");
				else
					bw.write("\n");
			}
		}
		bw.flush();bw.close();
	}
}
