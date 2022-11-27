package Homework;

import java.util.Scanner;

public class Group_2_Task_3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите любое число: \n");

        int n = in.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum = sum + i;
        }

        System.out.println(sum);

    }
}
