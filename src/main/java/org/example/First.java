package org.example;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        int[] heights = new int[4];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < heights.length; i++) {
            heights[i] = in.nextInt();
        }

        if (heights[0] <= heights[1] && heights[1] <= heights[2] && heights[2] <= heights[3]) {
            System.out.println("YES");
        } else if (heights[0] >= heights[1] && heights[1] >= heights[2] && heights[2] >= heights[3]) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}