package Á¤·Ä;

import java.util.*;

public class n_1427 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] arr=sc.nextLine().split("");
		Arrays.sort(arr);
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]);	
		}
	}
}
