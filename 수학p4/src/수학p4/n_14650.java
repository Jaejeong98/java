package ¼öÇĞp4;

import java.util.*;

public class n_14650 {
	static int result = 0;
	public static void func(int n, int sum, int num){
        for(int i = 0; i < 3; i++){
            if(n == 0 && i == 0)
                continue;
            if(n == num){
                if(sum % 3 == 0) result++;
                return;
            } 
            else
                func(n + 1, sum + i, num);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        func(0, 0, num);
        System.out.println(result);
    }
}
