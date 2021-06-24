package ¼öÇĞp6;

import java.util.*;

public class n_21312 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[3], num=1;
		boolean b=false;
		for(int i=0; i<3; i++) {
			arr[i]=sc.nextInt();
			num*=arr[i];
			if(arr[i]%2!=0)
				b=true;
		}
		if(b) {
			num=1;
			for(int i=0; i<3; i++) {
				if(arr[i]%2!=0)
					num*=arr[i];
			}
		}
		System.out.println(num);
	}
}
