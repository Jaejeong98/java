package ±¸Çö;

import java.util.*;

public class n_3047 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[3];
		for(int i=0; i<3; i++)
			arr[i]=sc.nextInt();
		Arrays.sort(arr);
		String st=sc.next();
		for(int i=0; i<3; i++){
			char ch=st.charAt(i);
			if(ch=='A') System.out.print(arr[0]+" ");
			else if(ch=='B') System.out.print(arr[1]+" ");
			else System.out.print(arr[2]+" ");
		}
	}
}
