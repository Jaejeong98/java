package 기본수학2;

import java.io.*;

public class n_1085 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] array=br.readLine().split(" ");
		int x=Integer.parseInt(array[0]);
		int y=Integer.parseInt(array[1]);
		int w=Integer.parseInt(array[2]);
		int h=Integer.parseInt(array[3]);
		
		int x_length=Math.min(x,w-x);
		int y_length=Math.min(y,h-y);
		System.out.println(Math.min(x_length, y_length));
	}
}