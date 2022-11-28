package Homework;

import java.util.Scanner;

public class Group_3_Task_2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        float dep;
        int month;

        System.out.println("Введите сумму, которые желаете положить на депозит: \n");
        dep = in.nextFloat();
        System.out.println("Введите количество месяцев, насколько вы желаете положить депозит: \n");

        float rez = 0;
        float sum = 0;
        for (month = in.nextInt(); month > 0; month--) {

            sum = (float) (dep + dep * 0.07);
            float Last_rez = (float) (sum + sum * 0.07);




        }
        System.out.println(sum);


    }
}
