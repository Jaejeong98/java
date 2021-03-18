package ¼öÇÐp3;

import java.io.*;

public class n_1551 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] st1=br.readLine().split(" ");
		String[] st2=br.readLine().split(",");
		int[]arr=new int[st2.length];
		for(int i=0; i<st2.length; i++)
			arr[i]=Integer.parseInt(st2[i]);
		for(int i=0; i<Integer.parseInt(st1[1]); i++) {
			for(int j=0; j<st2.length-1; j++)
				arr[j]=arr[j+1]-arr[j];
		}
		for(int i=0; i<st2.length-Integer.parseInt(st1[1]); i++) {
			System.out.print(arr[i]);
			if(i!=st2.length-Integer.parseInt(st1[1])-1)
				System.out.print(",");
		}
	}
}
