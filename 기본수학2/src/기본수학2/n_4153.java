package 기본수학2;

import java.io.*;

public class n_4153 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			String[] array=br.readLine().split(" ");
			int A=Integer.parseInt(array[0]);
			int B=Integer.parseInt(array[1]);
			int C=Integer.parseInt(array[2]);
			int max=Math.max(Math.max(A, B),C);
			if(A==0&&B==0&&C==0)
				break;
			if(max==A) {
				if(A*A==B*B+C*C)
					System.out.println("right");
				else
					System.out.println("wrong");
			}
			if(max==B) {
				if(B*B==A*A+C*C)
					System.out.println("right");
				else
					System.out.println("wrong");
			}
			if(max==C) {
				if(C*C==B*B+A*A)
					System.out.println("right");
				else
					System.out.println("wrong");
			}
		}
	}
}
