package Java_One;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        int num=0;
        do {
            System.out.println("I Like JAVA " + num);
            num++;
        } while(num < 5);

        //하나의 양의 정수를 입력받아서 각 자리수를 떼어냄
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력 후 Enter : ");

        int n = sc.nextInt();
        while (n > 0){
            int m = n % 10;
            System.out.println(m);
            n /= 10;
        }
        sc.close();
    }
}
