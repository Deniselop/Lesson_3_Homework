package Homework;

import java.util.Scanner;

public class Group_1_Task_5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите номер цвета радуги от 1 до 7: \n");
        String COLOR = "";
        int num = in.nextInt();


        if (num == 1) COLOR = "Красный";
        else
        if (num == 2) COLOR = "Оранжевый";
        else
        if (num == 3) COLOR = "Жёлтый";
        else
        if (num == 4) COLOR = "Зелёный";
        else
        if (num == 5) COLOR = "Синий";
        else
        if (num == 6) COLOR = "Индиго";
        else
        if (num == 7) COLOR = "Фиолетовый";

        System.out.println(COLOR);

    }
}
