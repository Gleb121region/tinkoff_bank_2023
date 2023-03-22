package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] arr = new int[size];
        int count = 0;
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }
        int[] arr2 = new int[size + 1];
        for (int i = 1; i <= size; i++) {
            arr2[i] = arr2[i - 1] + arr[i - 1];
        }
        Map<Integer, Boolean> reps = new HashMap<>();
        for (int i = 1; i <= size; i++) {
            for (int j = i; j <= size; j++) {
                int s = arr2[j] - arr2[i - 1];
                if (j > i && reps.getOrDefault(s, false)) {
                    count++;
                }
                reps.put(s, true);
            }
        }
        System.out.println(count + 1);
    }
}
