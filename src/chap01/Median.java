package chap01;

import java.util.Scanner;

public class Median {
    static int med3(int a , int b, int c){
        if(a>=b)
            if(b>=c) //a가 b보다 크고 b가 c보다 더 크면 b가 중간값
                return b;
            else if(a<=c) // a가 b보다 더 크고 a가 c보다 작으면 a가 중간값
                return a;
            else
                return c; // a가 b보다 크고 a가 c보다 크면 c가 중간값
        else if(a>c)
            return a; // a가 b보다 작고 a가 c보다 크면  a가 중간값
        else if( b>c)
            return c; // a가 b보다 작고 b가 c보다 크면 c가 중간값
        else
            return b; // a가 b보다 작고 b가 c보다 작으면
    }

    static int med3_b(int a, int b, int c ){
        if((b >= a && c <= a) || (b <= a && c>= a))
            return a;
        else if((a>b && c<b) || (a< b && c> b))
            return b;
        return c;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("세 정수의 중앙값을 구합니다.");
        System.out.println("a의 값 : "); int a = stdIn.nextInt();
        System.out.println("b의 값 : "); int b = stdIn.nextInt();
        System.out.println("c의 값 : "); int c = stdIn.nextInt();

        System.out.println("중간값은 " + med3(a, b, c) + "입니다");
        System.out.println("중간값은 " + med3_b(a, b, c) + "입니다");

    }
}
