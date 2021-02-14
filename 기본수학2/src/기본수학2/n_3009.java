package 기본수학2;

import java.util.*;

public class n_3009 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[]array_x=new int[3];
		int[]array_y=new int[3];
		for(int i=0; i<3; i++) {
			array_x[i]=sc.nextInt();
			array_y[i]=sc.nextInt();
		}
		int x=array_x[0], y=array_y[0];
		if(array_x[0]==array_x[1])
			x=array_x[2];
		else if(array_x[0]==array_x[2])
			x=array_x[1];
		
		if(array_y[0]==array_y[1])
			x=array_y[2];
		else if(array_y[0]==array_y[2])
			x=array_y[1];
		System.out.println(x+" "+y);
	}
}
