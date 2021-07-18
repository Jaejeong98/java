package ±¸Çö2;

import java.io.*;
import java.util.Arrays;

public class n_17826 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String st[]=br.readLine().split(" "), score=br.readLine();
		int rank=0;
		for(int i=0; i<50; i++) {
			if(st[i].equals(score))
				rank=i+1;
		}
		if (rank<=5) {
			System.out.println("A+");
		}else if (rank<=15) {
			System.out.println("A0");
		}else if (rank<=30) {
			System.out.println("B+");
		}else if (rank<=35) {
			System.out.println("B0");
		}else if (rank<=45) {
			System.out.println("C+");
		}else if (rank<=48) {
			System.out.println("C0");
		}else {
			System.out.println("F");
		}
	}
}
