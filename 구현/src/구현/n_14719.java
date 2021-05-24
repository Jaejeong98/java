package ±¸Çö;

import java.io.*;

public class n_14719 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] st=br.readLine().split(" "), st2=br.readLine().split(" ");
		int h[]=new int[Integer.parseInt(st[1])],sum=0;
		for(int i=0;i<Integer.parseInt(st[1]);i++)
			h[i]=Integer.parseInt(st2[i]);
		for(int i=0;i<Integer.parseInt(st[1]);i++) {
			int left=i,right=i;
			for(int j=i;j>=0;j--) {
				if(h[j]>h[left])
					left=j;
			}
			for(int k=i;k<Integer.parseInt(st[1]);k++) {
				if(h[k]>h[right])
					right=k;
			}
			int s=Math.min(h[left], h[right])-h[i];
			if(s>0)
				sum+=s;
		}
		System.out.println(sum);
	}
}
