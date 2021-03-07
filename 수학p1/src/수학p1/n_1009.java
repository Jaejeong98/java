package ¼öÇÐp1;

import java.io.*;
import java.util.*;

public class n_1009 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			int j=1;
			String[] st=br.readLine().split(" ");
			ArrayList<Integer> list=new ArrayList<>();
			while(true) {
				j*=Integer.parseInt(st[0]);
				j%=10;
				if(j==0)
					j=10;
				if(list.contains(j))
					break;
				else
					list.add(j);
			}
			int num=(Integer.parseInt(st[1])-1)%list.size();
			bw.write(list.get(num)+"\n");
		}
		bw.flush();
		bw.close();
	}
}
