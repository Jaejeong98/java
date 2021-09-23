package ½Ã¹Ä·¹ÀÌ¼Ç;

import java.io.*;

public class n_2979 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String st[]=br.readLine().split(" ");
		int arr[]=new int[101], max=0, sum=0;
		for(int i=0; i<3; i++) {
			String str[]=br.readLine().split(" ");
			for(int j=Integer.parseInt(str[0]); j<Integer.parseInt(str[1]); j++)
				arr[j]++;
			max=Math.max(max, Integer.parseInt(str[1]));
		}
		for(int i=1; i<=max; i++) {
			if(arr[i]==1) sum+=Integer.parseInt(st[0]);
			else if(arr[i]==2) sum+=Integer.parseInt(st[1])*2;
			else if(arr[i]==3) sum+=Integer.parseInt(st[2])*3;
		}
		System.out.println(sum);
	}
}