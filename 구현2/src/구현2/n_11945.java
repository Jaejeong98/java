package ±¸Çö2;

import java.io.*;

public class n_11945 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String st[]=br.readLine().split(" ");
		for(int i=0; i<Integer.parseInt(st[0]); i++) {
			String str=br.readLine(), newstr="";
			for(int j=Integer.parseInt(st[1])-1; j>=0; j--)
				newstr+=str.charAt(j);
			bw.write(newstr+"\n");
		}
		bw.flush();bw.close();
	}
}