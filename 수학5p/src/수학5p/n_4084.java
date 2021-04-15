package ¼öÇÐ5p;

import java.io.*;

public class n_4084 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		while(true) {
			String[] st=br.readLine().split(" ");
			int arr[]=new int[4];
			for(int j=0; j<4; j++)
				arr[j]=Integer.parseInt(st[j]);
			if(arr[0]==0&&arr[1]==0&&arr[2]==0&&arr[3]==0)
				break;
			int count=0;
			while(true) {
				int a=Math.abs(arr[0]-arr[1]), b=Math.abs(arr[1]-arr[2]);
				int c=Math.abs(arr[2]-arr[3]), d=Math.abs(arr[3]-arr[0]);
				count++;
				if(a==b&&b==c&&c==d)
					break;
				arr[0]=a;arr[1]=b;arr[2]=c;arr[3]=d;
			}
			if(arr[0]==arr[1]&&arr[1]==arr[2]&&arr[2]==arr[3])
				bw.write("0\n");
			else
				bw.write(count+"\n");
		}
		bw.flush();
		bw.close();
	}
}
