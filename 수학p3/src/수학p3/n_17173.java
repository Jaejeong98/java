package ¼öÇÐp3;

import java.io.*;
import java.util.Arrays;

public class n_17173 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] st1=br.readLine().split(" "), st2=br.readLine().split(" ");
		int arr[]=new int[1001], sum=0;
		Arrays.fill(arr, 0);
		for(int i=0; i<Integer.parseInt(st1[1]); i++) {
			for(int j=2; j<=Integer.parseInt(st1[0]); j++) {
				if(j%Integer.parseInt(st2[i])==0) {
					if(arr[j]==1)
						continue;
					else
						arr[j]++;
				}
			}
		}
		for(int i=2; i<=Integer.parseInt(st1[0]); i++) {
			if(arr[i]==1)
				sum+=i;
		}
		System.out.println(sum);
	}
}