package 많은조건분기;

import java.io.*;

public class n_15953 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		int arr1[]= {500,300,200,50,30,10}, arr1_n[]= {1,2,3,4,5,6};
		int arr2[]= {512,256,128,64,32}, arr2_n[]= {1,2,4,8,16};
		for(int i=1; i<arr1_n.length; i++)
			arr1_n[i]=arr1_n[i]+arr1_n[i-1];
		for(int i=1; i<arr2_n.length; i++)
			arr2_n[i]=arr2_n[i]+arr2_n[i-1];
		for(int i=0; i<T; i++) {
			String st[]=br.readLine().split(" ");
			int m=0, n1=Integer.parseInt(st[0]), n2=Integer.parseInt(st[1]);
			if(n1>0&&n1<=21) {
				for(int j=0; j<arr1_n.length; j++) {
					if(arr1_n[j]>=n1) {
						m+=arr1[j]*10000;
						break;
					}
				}
			}
			if(n2>0&&n2<=31) {
				for(int j=0; j<arr2_n.length; j++) {
					if(arr2_n[j]>=n2) {
						m+=arr2[j]*10000;
						break;
					}
				}
			}
			bw.write(m+"\n");
		}
		bw.flush();bw.close();
	}
}