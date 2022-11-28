package Homework;

public class Group_3_Task_1 {
    public static void main(String[] args) {

        int a = 0;
        int b = 1;
        int c = 1;


        for (int i = 0; i < 11; i++){

            a = c + b;
            c = b;
            b = a;
            System.out.println(a);

        }








    }
}
