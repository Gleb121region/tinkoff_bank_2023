package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Sixth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int s = in.nextInt();
        int[][] students = new int[n][2];

        for (int i = 0; i < n; i++) {
            students[i][0] = in.nextInt();
            students[i][1] = in.nextInt();
        }

        Arrays.sort(students, (a, b) -> Integer.compare(a[1], b[1]));

        int middleA = students[(n - 1) / 2][0];
        int midddleB = students[(n - 1) / 2][1];

        while (middleA < midddleB) {
            int middle = (middleA + midddleB + 1) / 2;
            int leftSum = 0, rightSum = 0;
            for (int i = 0; i < n; i++) {
                if (i > (n - 1) / 2) {
                    rightSum += Math.max(students[i][0], middle);
                } else {
                    leftSum += Math.max(students[i][0], middle);
                }
            }
            if (leftSum + rightSum > s) {
                midddleB = middle - 1;
            } else {
                middleA = middle;
            }
        }
        System.out.println(middleA + 1);
    }
}