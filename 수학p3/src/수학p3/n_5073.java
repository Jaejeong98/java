package ¼öÇÐp3;

import java.io.*;
import java.util.Arrays;

public class n_5073 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		while(true) {
			String[] st=br.readLine().split(" ");
			int[] arr=new int[3];
			for(int i=0; i<3; i++)
				arr[i]=Integer.parseInt(st[i]);
			if(arr[0]==0&&arr[1]==0&&arr[2]==0)
				break;
			Arrays.sort(arr);
			if(arr[2]>=arr[1]+arr[0])
				bw.write("Invalid\n");
			else {
				if(arr[0]==arr[1]&&arr[1]==arr[2])
					bw.write("Equilateral\n");
				else if(arr[0]!=arr[1]&&arr[1]!=arr[2]&&arr[2]!=arr[0])
					bw.write("Scalene\n");
				else
					bw.write("Isosceles\n");
			}
		}
		bw.flush();
		bw.close();
	}
}
