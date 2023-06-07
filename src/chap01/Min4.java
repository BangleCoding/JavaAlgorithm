package chap01;

import java.util.Scanner;

public class Min4 {

    static int min4(int a, int b, int c, int d){

        int min = a;

        if(b<min)
            min = b;
        if(c<min)
            min = c;
        if(d<min)
            min = d;

        return min;
    }

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("a의 값 입력:"); int a = scanner.nextInt();
        System.out.println("b의 값 입력:"); int b = scanner.nextInt();
        System.out.println("c의 값 입력:"); int c = scanner.nextInt();
        System.out.println("d의 값 입력:"); int d = scanner.nextInt();

        System.out.println("제일작은값::::"+ min4(a,b,c,d) );



    }
}
