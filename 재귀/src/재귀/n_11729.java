package Àç±Í;

import java.util.*;
import java.io.*;

public class n_11729 {
	public static BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	public static void H(int n, int from, int by, int to) throws IOException{
		if(n==1)
			bw.write(from+" "+to+"\n");
		else {
			H(n-1, from, to, by);
			bw.write(from+" "+to+"\n");
			H(n-1, by, from, to);
		}
	}
	public static void main(String[] args) throws IOException{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println((int)Math.pow(2, n)-1);
		H(n,1,2,3);
		bw.flush();
		bw.close();
	}
}
