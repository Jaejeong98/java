package ±¸Çö;

import java.util.*;

public class n_10101 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[3];
		for(int i=0; i<3; i++)
			arr[i]=sc.nextInt();
		if(arr[0] == 60 && arr[1] == 60 && arr[2] == 60)
			System.out.println("Equilateral");
		else if(arr[0] + arr[1] + arr[2] == 180 && ((arr[0] == arr[1])||(arr[0] == arr[2]) || (arr[1] == arr[2])))
			System.out.println("Isosceles");
		else if(arr[0] + arr[1] + arr[2] == 180 && ((arr[0] != arr[1])||(arr[0] != arr[2]) || (arr[1] != arr[2])))
			System.out.println("Scalene");
		else
			System.out.println("Error");
	}
}
