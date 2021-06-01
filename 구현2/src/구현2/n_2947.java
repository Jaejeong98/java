package ±¸Çö2;

import java.util.*;

public class n_2947 {
	public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String[] nums = sc.nextLine().split(" ");
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++)
            arr[i] = Integer.parseInt(nums[i]);
        for(int i=0; i<arr.length-1;i++){
            for (int j=0; j<arr.length-1; j++){
                if(arr[j]>arr[j+1]){
                    int num=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=num;
                    for(int k=0; k<arr.length; k++)
                        System.out.print(arr[k]+" ");
                    System.out.println();
                }
            }
        }
    }
}