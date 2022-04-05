package AlbertFar.Day2;

import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        System.out.println("Введите а & b");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (b <= a) {
            System.err.println("Ошибка ввода");
        }
        int x = a+1;
       while (x<b){
           if (x%5==0&&x%10!=0){
               System.out.print(x+" ");
           }x++;
       }
    }
}
