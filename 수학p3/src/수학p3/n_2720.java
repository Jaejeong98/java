package ¼öÇÐp3;

import java.io.*;

public class n_2720 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine()), arr[]= {25, 10, 5,1};
		for(int i=0; i<n; i++) {
			int price=Integer.parseInt(br.readLine());
			for(int j=0; j<4; j++) {
				bw.write(price/arr[j]+" ");
				price%=arr[j];
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}
}
