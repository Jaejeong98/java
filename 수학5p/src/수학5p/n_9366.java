package ¼öÇÐ5p;

import java.io.*;
import java.util.Arrays;

public class n_9366 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			String[] st=br.readLine().split(" ");
			int[] arr=new int[3];
			for(int j=0; j<3; j++)
				arr[j]=Integer.parseInt(st[j]);
			bw.write("Case #"+(i+1)+": ");
			Arrays.sort(arr);
			if(arr[2]>=arr[1]+arr[0])
				bw.write("invalid!\n");
			else {
				if(arr[0]==arr[1]&&arr[1]==arr[2])
					bw.write("equilateral\n");
				else if(arr[0]!=arr[1]&&arr[1]!=arr[2]&&arr[0]!=arr[2])
					bw.write("scalene\n");
				else
					bw.write("isosceles\n");
			}
		}
		bw.flush();
		bw.close();
	}
}
