package AlbertFar.Day2;

import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {
        System.out.println("Введите количество этажей:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a<1){
            System.err.println("Ошибка ввода");
        }else if (a>=1&&a<=4){
            System.out.println("Малоэтажный дом");
        }else if (a>=5&&a<=8){
            System.out.println("Среднеэтажный дом");
        }else if (a>=9){
            System.out.println("Многоэтажный дом");
        }
    }
}
