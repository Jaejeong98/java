package ¹®ÀÚ¿­;

import java.util.*;

public class n_1371 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[] = new int[26], max = 0;
        while (scan.hasNextLine()) {
            String st = scan.nextLine();
            for (int i = 0; i < st.length(); i++) {
                if (st.charAt(i) >= 'a' && st.charAt(i) <= 'z')
                    arr[st.charAt(i) - 'a']++;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (max < arr[i]) max = arr[i];
        }
        for (int i = 0; i < 26; i++) {
            if (max == arr[i]) System.out.print((char) (i + 'a'));
        }
    }
}