package ±¸Çö;

import java.io.*;

public class n_2490 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		for(int j=0; j<3; j++) {
			String str[]=br.readLine().split(" ");
			int num=0;
			for(int i=0; i<4; i++) {
				if(str[i].equals("0"))
					num++;
			}
			if(num==1)
				System.out.println("A");
			else if(num==2)
				System.out.println("B");
			else if(num==3)
				System.out.println("C");
			else if(num==4)
				System.out.println("D");
			else
				System.out.println("E");
		}
	}
}
