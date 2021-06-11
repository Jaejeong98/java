package Á¤·Ä;

import java.util.*;

public class n_2822 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr1[]= new int[8], arr2[]= new int[3], num= 0, sum = 0;
		for(int i=0; i<arr1.length; i++)
			arr1[i] = scan.nextInt();
		int[] arr3 = Arrays.copyOf(arr1, 8);
		Arrays.sort(arr3);
		for(int i=0; i<3; i++) {
			for(int j=0; j<arr1.length; j++) {
				if(arr3[i] == arr1[j]) 
					arr2[i] = j;
			}
		}
		String st="";
		for(int i=0; i<arr1.length; i++) {
			if(i == arr2[0] || i == arr2[1] || i == arr2[2])
				continue;
			sum += arr1[i];
			st+=(i+1)+" ";
		}
		System.out.println(sum+"\n"+st);
	}
}