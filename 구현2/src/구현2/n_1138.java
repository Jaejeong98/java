package ±¸Çö2;

import java.util.Scanner;

public class n_1138 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(), arr[] = new int[T+1];
        for (int i = 1; i <= T; i++) {
            int num = sc.nextInt();
            for (int j = 1; j <= T; j++) {
                if (num == 0 && arr[j] == 0) { 
                    arr[j] = i;
                    break;
                } else if (arr[j] == 0)num--;
            }
        }
        for (int i = 1; i <= T; i++)
            System.out.print(arr[i] + " ");
    }
}