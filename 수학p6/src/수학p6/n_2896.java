package ¼öÇÐp6;

import java.io.*;

public class n_2896 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String st[]=br.readLine().split(" "), st2[]=br.readLine().split(" ");
		double arr[]=new double[3];
		for(int i=0; i<3; i++) 
			arr[i]=Double.parseDouble(st[i])/Double.parseDouble(st2[i]);
		double min=Math.min(Math.min(arr[0], arr[1]), arr[2]);
		for(int i=0; i<3; i++) {
			float n=(float) (Integer.parseInt(st[i])-Integer.parseInt(st2[i])*min);
			System.out.print(n%1==0?Math.round(n)+" ":Math.round(n*1000000)/1000000.0+" ");
		}
	}
}