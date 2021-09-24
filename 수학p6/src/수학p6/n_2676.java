package ¼öÇÐp6;

import java.io.*;

public class n_2676 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String[] st = br.readLine().split(" ");
            int n1 = Integer.parseInt(st[0]), n2 = Integer.parseInt(st[1]);
            bw.write(1+(n1-n2)*n2 + "\n");
        }
        bw.flush();bw.close();
    }
}