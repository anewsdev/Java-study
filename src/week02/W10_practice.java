package week02;

import java.util.Scanner;

public class W10_practice {

    public static void main(String[] args) {

        //입력받는 단을 제외하고 출력!!
        Scanner sc = new Scanner(System.in);
        int passNum = sc.nextInt();

        //구구단
        for(int i=2; i<=9; i++){
//            if (i == passNum){
//                break;
//            }
            for(int j=2; j<=9; j++){
                System.out.println(i + "곱하기" + j + "는" + (i*j) + "입니다.");
            }
        }
    }
}
