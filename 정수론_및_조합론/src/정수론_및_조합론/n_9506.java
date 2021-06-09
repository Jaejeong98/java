package 정수론_및_조합론;

import java.io.*;
import java.util.*;

public class n_9506 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		while(true) {
			int num=Integer.parseInt(br.readLine()),sum=0;
			ArrayList<Integer> list = new ArrayList<>();
			if(num==-1) break;
			for(int i=1; i<num; i++) {
				if(num%i==0)
					list.add(i);
			}
			for(int i=0; i<list.size(); i++) 
				sum+=list.get(i);
			if(sum!=num) System.out.print(num+" is NOT perfect.");
			else {
				System.out.print(num+" = ");
				for(int i=0; i<list.size(); i++) {
					System.out.print(list.get(i));
					if(i!=list.size()-1)
						System.out.print(" + ");
				}
			}
			System.out.println("");
		}
	}
}