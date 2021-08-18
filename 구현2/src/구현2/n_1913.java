package ±¸Çö2;

import java.util.*;
import java.io.*;

public class n_1913 {
    public static void main(String[] args) throws IOException{
        Scanner s = new Scanner(System.in);
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int T = s.nextInt(), n= s.nextInt(), arr[][] = new int[T][T], i = T / 2, j = T / 2, c= 1, num = 1;
        while (true) {
            for (int k = 0; k < c; k++) {
                arr[i][j] = num++;
                i--;
            }
            if ((num - 1) == T*T) break;
            for (int k = 0;k < c;k++) {
                arr[i][j] = num++;
                j++;
            }c++;
            for (int k = 0;k < c; k++) {
                arr[i][j] = num++;
                i++;
            }
            for (int k = 0; k < c; k++) {
                arr[i][j] = num++;
                j--;
            }c++;
        }
        for (int k = 0; k < T; k++) {
            for (int l= 0;l < T; l++) {
                bw.write(arr[k][l] + " ");
                if (n == arr[k][l]) {
                    i= k + 1;
                    j= l + 1;
                }
            }
            bw.write("\n");
        }
        bw.write(i+" "+j);
        bw.flush();bw.close();
    }
}