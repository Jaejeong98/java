package ¼öÇÐp1;

import java.io.*;

public class n_5543 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int[] array=new int[5];
		for(int i=0; i<5; i++)
			array[i]=Integer.parseInt(br.readLine());
		System.out.println(Math.min(Math.min(array[0], array[1]), array[2])
				+Math.min(array[3], array[4])-50);
	}
}
