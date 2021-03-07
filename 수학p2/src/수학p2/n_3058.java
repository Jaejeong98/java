package ¼öÇÐp2;

import java.io.*;
import java.util.*;

public class n_3058 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			ArrayList<Integer> list=new ArrayList<>();
			String[] st=br.readLine().split(" ");
			int sum=0;
			for(int j=0; j<7; j++) {
				int n=Integer.parseInt(st[j]);
				if(n%2==0) {
					list.add(n);
					sum+=n;
				}
			}
			Collections.sort(list);
			bw.write(sum+" "+list.get(0)+"\n");
		}
		bw.flush();
		bw.close();
	}
}
