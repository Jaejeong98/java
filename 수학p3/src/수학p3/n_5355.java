package ¼öÇÐp3;

import java.io.*;

public class n_5355 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			String[] st=br.readLine().split(" ");
			double num=Double.parseDouble(st[0]);
			for(int j=1; j<st.length; j++) {
				if(st[j].equals("@"))
					num*=3;
				else if(st[j].equals("%"))
					num+=5;
				else if(st[j].equals("#"))
					num-=7;
			}
			bw.write(String.format("%.2f", num)+"\n");
		}
		bw.flush();
		bw.close();
	}
}
