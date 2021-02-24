package Á¤·Ä;

import java.io.*;
import java.util.*;

public class n_10814 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		String[][] st=new String[n][2];
		for(int i=0; i<n; i++)
			st[i]=br.readLine().split(" ");
		Arrays.sort(st, new Comparator<String[]>() {

			@Override
			public int compare(String[] o1, String[] o2) {
				return Integer.parseInt(o1[0])-Integer.parseInt(o2[0]);
			}
		});
		for(int i=0; i<n; i++) {
			bw.write(st[i][0]+" "+st[i][1]+"\n");
		}
		bw.flush();
		bw.close();
	}
}
