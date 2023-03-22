package org.example;


import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        int[] arr = new int[3];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int numberOfJunks = arr[0];
        int numberOfSeniors = arr[1];
        int numberOfMandatoryInspections = arr[2];
        int timeSpentChecking = 0;
        int checkedProgram = 0;
        while (numberOfJunks * numberOfMandatoryInspections > checkedProgram) {
            for (int i = 0; i < numberOfSeniors; i++) {
                checkedProgram++;
            }
            timeSpentChecking++;
        }
        System.out.println(timeSpentChecking);
    }
}
