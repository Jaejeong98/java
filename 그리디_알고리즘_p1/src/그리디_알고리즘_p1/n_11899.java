package 그리디_알고리즘_p1;

import java.io.*;

public class n_11899 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			int c=Integer.parseInt(br.readLine()), nw=0 ,nb=0;
			String st1[]=br.readLine().split(""), st2[]=br.readLine().split("");
			for(int j=0; j<c; j++) {
				if(!st1[j].equals(st2[j])) {
					if(st1[j].equals("W")) nw++;
					else nb++;
				}
			}
			bw.write(Math.max(nw,nb)+"\n");
		}
		bw.flush();bw.close();
	}
}