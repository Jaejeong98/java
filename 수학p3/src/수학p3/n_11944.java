package ¼öÇÐp3;

import java.util.*;

public class n_11944 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt(), num2=sc.nextInt();
		if(String.valueOf(num1).length()*num1 > num2) {
    		String[] arr= Integer.toString(num1).split("");
    		for(int i = 0; i<num2; i++)
    			System.out.print(arr[i%arr.length]);
    	}
    	else {
    		for(int i = 0 ; i<num1; i++)
    			System.out.print(num1);
    	}
	}
}
