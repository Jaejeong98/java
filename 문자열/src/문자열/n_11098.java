package ¹®ÀÚ¿­;

import java.io.*;

public class n_11098 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			int C=Integer.parseInt(br.readLine()), max=0;
			String st=new String();
			for(int j=0; j<C; j++) {
				String str[]=br.readLine().split(" ");
				if(max<Integer.parseInt(str[0])) {
					max=Integer.parseInt(str[0]);
					st=str[1];
				}
			}
			bw.write(st+"\n");
		}
		bw.flush();bw.close();
	}
}
