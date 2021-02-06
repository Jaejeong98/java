package for¹®;

import java.util.*;

public class n_2439 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=1; i<=num; i++) {
			for(int j=0; j<num-i; j++)
				System.out.print(" ");
			for(int k=0; k<i; k++)
				System.out.print("*");
			System.out.println("");
		}
	}
}
