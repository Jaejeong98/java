package 자료구조;

import java.io.*;
import java.util.*;

public class n_2776 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		for(int k=0; k<T; k++) {
			int c=Integer.parseInt(br.readLine());
			String st[]=br.readLine().split(" ");
			Set<Integer> set=new TreeSet<>();
			for(int i=0; i<c; i++)
				set.add(Integer.parseInt(st[i]));
			int n=Integer.parseInt(br.readLine());
			String str[]=br.readLine().split(" ");
			for(int i=0; i<n; i++)
				bw.write((set.contains(Integer.parseInt(str[i]))?1:0)+"\n");
		}
		bw.flush();bw.close();
	}
}