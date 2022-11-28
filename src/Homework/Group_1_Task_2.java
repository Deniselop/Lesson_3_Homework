package Homework;

import java.util.Scanner;

public class Group_1_Task_2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите номер месяца: \n");
        String MONTH = "";
        int month = in.nextInt();



        if (month==1) MONTH = "Январь";
        else
        if (month==2) MONTH = "Февраль";
        else
        if (month==3) MONTH = "Март";
        else
        if (month==4) MONTH = "Апрель";
        else
        if (month==5) MONTH = "Май";
        else
        if (month==6) MONTH = "Июнь";
        else
        if (month==7) MONTH = "Июль";
        else
        if (month==8) MONTH = "Август";
        else
        if (month==9) MONTH = "Сентябрь";
        else
        if (month==10) MONTH = "Октябрь";
        else
        if (month==11) MONTH = "Ноябрь";
        else
        if (month==12) MONTH = "Декабрь";

        System.out.println(MONTH);







    }












}
