package Á¤·Ä;

import java.io.*;
import java.util.*;

public class n_1946 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			int c=Integer.parseInt(br.readLine()), arr[][]=new int[c][2];
			for(int j=0; j<c; j++) {
				String st[]=br.readLine().split(" ");
				arr[j][0]=Integer.parseInt(st[0]);
				arr[j][1]=Integer.parseInt(st[1]);
			}
			Arrays.sort(arr, new Comparator<int[]>() {
				@Override
				public int compare(int[] o1, int[] o2) {
					// TODO Auto-generated method stub
					return Integer.compare(o1[0], o2[0]);
				}
			});
			int num=arr[0][1], count=0;
			for(int j=1; j<c; j++) {
				if(arr[j][1]<num) {count++; num=arr[j][1];}
			}
			bw.write(++count+"\n");
		}
		bw.flush();bw.close();
	}	
}
