package AlbertFar.Day2;

import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        System.out.println("Введите а & b");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (b <= a) {
            System.err.println("Ошибка ввода");
        } else {
            for (int i = a; a <= b; a++) {
                int x = a %5;
                int y = a%10;
                if ((x == 0)&&!(y==0)) {
                    System.out.println(a);
                }
            }
        }
    }
}
