package ¼öÇÐp6;

import java.io.*;

public class n_13116 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for (int i = 1; i <= T; i++) {
            String[] st=br.readLine().split(" ");
            int num1 = Integer.parseInt(st[0]), num2 = Integer.parseInt(st[1]);
            int min = Math.min(num1, num2);
            if(min == num1) { 
                while(num2 - num1 >= num1)
                   num2/=2;
            }
            else {
                while(num1 - num2 >= num2)
                    num1/=2;
            }
            while (num1 != num2) {
                if(num1 > num2) {
                    num1 /= 2;
                    if(num1== num2) break;
                    num2/= 2;
                }
                else {
                    num2/=2;
                    if(num1==num2) break;
                    num1/=2;
                }
            }
            bw.write((num1*10)+"\n");
        }
        bw.flush();
        bw.close();
    }
}