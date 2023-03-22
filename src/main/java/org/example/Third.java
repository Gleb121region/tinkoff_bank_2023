package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.Integer.MAX_VALUE;

public class Third {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int stringSize = in.nextInt();
        String string = in.next();
        Map<Character, Integer> symbol2Frequency = new HashMap<>();
        String symbols = "abcd";
        for (char c : symbols.toCharArray()) {
            symbol2Frequency.put(c, 0);
        }

        int right = 0;
        int left = 0;
        int minLength = MAX_VALUE;

        while (right < stringSize) {
            char c = string.charAt(right);
            symbol2Frequency.put(c, symbol2Frequency.get(c) + 1);
            right++;
            while (symbol2Frequency.values().stream().allMatch(it -> it > 0) && left < right) {
                char d = string.charAt(left);
                symbol2Frequency.put(d, symbol2Frequency.get(d) - 1);
                left++;
                if (!(symbol2Frequency.values().stream().allMatch(it -> it > 0))) {
                    minLength = Math.min(minLength, right - left + 1);
                }
            }
        }
        System.out.println(minLength == MAX_VALUE ? -1 : minLength);
    }
}
