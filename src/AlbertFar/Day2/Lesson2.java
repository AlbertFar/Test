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
        }
        for (int i = a +1;i<b;i++){
            if (i%5==0&&i%10!=0){
                System.out.print(i+" ");
            }
        }
    }
}
