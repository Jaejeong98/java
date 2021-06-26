package ±¸Çö2;

import java.util.*;

public class n_14761 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[3];
		for(int i=0; i<3; i++)
			arr[i]=sc.nextInt();
		for(int i=0; i<arr[2]; i++) {
			boolean b=false;
			if((i+1)%arr[0]==0) {
				System.out.print("Fizz");
				b=true;
			}
			if((i+1)%arr[1]==0) {
				System.out.print("Buzz");
				b=true;
			}
			if(b==false)
				System.out.print(i+1);
			System.out.println("");
		}
	}
}
