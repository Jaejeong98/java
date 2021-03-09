package ¼öÇÐp2;

import java.io.*;

public class n_9610 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		int arr[]=new int[5];
		for(int i=0; i<n; i++) {
			String[] st=br.readLine().split(" ");
			int x=Integer.parseInt(st[0]), y=Integer.parseInt(st[1]);
			if(x>0&&y>0)
				arr[0]++;
			else if(x<0&&y>0)
				arr[1]++;
			else if(x<0&&y<0)
				arr[2]++;
			else if(x>0&&y<0)
				arr[3]++;
			else
				arr[4]++;
		}
		for(int i=0; i<5; i++) {
			if(i==4)
				System.out.println("AXIS: "+arr[i]);
			else
				System.out.println("Q"+(i+1)+": "+arr[i]);
		}
	}
}
