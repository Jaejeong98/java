package ½Ã¹Ä·¹ÀÌ¼Ç;

import java.io.*;
import java.util.Arrays;

public class n_21918 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String st[]=br.readLine().split(" ");
		int n1=Integer.parseInt(st[0]), n2=Integer.parseInt(st[1]),arr[]=new int[n1+1];
		String st2[]=br.readLine().split(" ");
		for(int i=1; i<=n1; i++)
			arr[i]=Integer.parseInt(st2[i-1]);
		for(int i=0; i<n2; i++) {
			String st3[]=br.readLine().split(" ");
			int a=Integer.parseInt(st3[0]), b=Integer.parseInt(st3[1]), c=Integer.parseInt(st3[2]);
			switch(a) {
			case 1:
				arr[b]=c;
				break;
			case 2:
				for(int j=b; j<=c; j++)
					arr[j]=arr[j]==1?0:1;
				break;
			case 3:
				for(int j=b; j<=c; j++)
					arr[j]=0;
				break;
			default:
				for(int j=b; j<=c; j++)
					arr[j]=1;
				break;
			}
		}
		for(int i=1; i<arr.length; i++)
			bw.write(arr[i]+" ");
		bw.flush();bw.close();
	}
}