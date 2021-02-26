package ¼öÇÐp1;

import java.io.*;

public class n_2845 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String[] st=br.readLine().split(" ");
		int L=Integer.parseInt(st[0]), P=Integer.parseInt(st[1]);
		String[] p=br.readLine().split(" ");
		for(int i=0; i<5; i++)
			bw.write(Integer.parseInt(p[i])-L*P+" ");
		bw.flush();
		bw.close();
	}
}
