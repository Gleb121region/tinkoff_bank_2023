package org.example;

import java.util.*;

public class Fourth {
    public static boolean isBoring(int[] prefix) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i : prefix) {
            hashMap.put(i, hashMap.getOrDefault(i, 0) + 1);
        }
        List<Integer> list = hashMap.values().stream().toList();
        for (int i = 0; i < list.size(); i++) {
            if (i == 0 && (list.size() == 1 || (list.get(i).compareTo(list.get(i + 1)) == 0))) {
                continue;
            }
            if (i == list.size() - 1 && (list.get(i).compareTo(list.get(i - 1)) == 0)) {
                continue;
            }
            List<Integer> integers = new ArrayList<>(list);
            integers.remove(i);
            if (integers.size() == list.size() - 1 && integers.stream().distinct().limit(2).count() <= 1) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = in.nextInt();
        }
        for (int l = count; l > 1; l--) {
            if (isBoring(Arrays.copyOfRange(arr, 0, l))) {
                System.out.println(l);
                return;
            }
        }
        System.out.println(2);
    }
}
