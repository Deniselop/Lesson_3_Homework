package Homework;

import java.util.Scanner;

public class Group_1_Task_4 {

    public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    System.out.println("Введите температуру на улице: \n");
    String TEMPA  = "";
    int t = in.nextInt();

    if (t >= -5) TEMPA = "Тепло";
    else
    if (t <= -5 && t >= -20) TEMPA = "Нормально";
    else
    if (t <= -20) TEMPA = "Холодно";

        System.out.println(TEMPA);


    }













}
