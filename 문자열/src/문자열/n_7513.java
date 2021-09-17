package ¹®ÀÚ¿­;

import java.io.*;

public class n_7513 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		for(int i=0;i<T; i++) {
			int n=Integer.parseInt(br.readLine());
			String st[]=new String[n];
			for(int j=0; j<n; j++)
				st[j]=br.readLine();
			int c=Integer.parseInt(br.readLine());
			bw.write("Scenario #"+(i+1)+":\n");
			for(int k=0; k<c; k++) {
				String str[]=br.readLine().split(" ");
				for(int j=1; j<=Integer.parseInt(str[0]); j++)
					bw.write(st[Integer.parseInt(str[j])]);
				bw.write("\n");
			}
			bw.write("\n");
		}
		bw.flush();bw.close();
	}
}
