package ДЉРћЧе;

import java.io.*;

public class n_3020 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String st[]=br.readLine().split(" ");
		int n1=Integer.parseInt(st[0]),n2=Integer.parseInt(st[1]), min=Integer.MAX_VALUE, count=0;
		int u[]=new int[n2+1], b[]=new int[n2+1];
		for(int i=0; i<n1; i++) {
			if(i%2==0) b[Integer.parseInt(br.readLine())]++;
			else u[Integer.parseInt(br.readLine())]++;
		}
		for(int i=1; i<n2+1; i++) {
			b[i]+=b[i-1];
			u[i]+=u[i-1];
		}
		for(int i=1; i<=n2; i++) {
			int num=b[n2]-b[i-1]+u[n2]-u[n2-i];
			if(num<min) {
				min=num;
				count=1;
			}
			else if(num==min) count++;
		}
		System.out.println(min+" "+count);
	}
}
