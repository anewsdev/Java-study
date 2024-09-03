package week02;

import java.util.Objects;
import java.util.Scanner;

public class W06_if {
    public static void main(String[] args) {
//        boolean flag = true;
//
//        if(flag) {
//            //true인 경우
//            System.out.println("값이 true 입니다.");
//        } else {
//            System.out.println("값이 false 입니다.");
//        }

//        int num = 2;
//        if(num == 1){
//            System.out.println("num 값은 1입니다.");
//        } else if(num == 2) {
//            System.out.println("num 값은 2입니다.");
//        } else {
//            System.out.println("num 값은 2입니다.");
//        }

        //중첩 if문
//        boolean flag = true;
//        int num = 2;
//
//        if(flag){
//            if(num == 1) {
//            System.out.println("flag 가 true 입니다.");
//            } else if (num == 2) {
//                System.out.println("flage 값은 true고, number값은 2입니다.");
//            } else{
//                System.out.println("flag 값은 true고, num값은 모르겠습니다.");
//            }
//        } else {
//            if(num == 1) {
//                System.out.println("flag 가 true 입니다.");
//            } else if (num == 2) {
//                System.out.println("flage 값은 true고, number값은 2입니다.");
//            } else{
//                System.out.println("flag 값은 true고, num값은 모르겠습니다.");
//            }
//        }

        Scanner sc = new Scanner(System.in);

        // A에게 값 입력받기
        System.out.println("A입력 : ");
        String aHand = sc.nextLine();
        // B에게 값 입력받기
        System.out.println("B입력 : ");
        String bHand = sc.nextLine();

        if(Objects.equals(aHand, "가위")){
            if (Objects.equals(bHand, "가위")){
                System.out.println("a,b 비겼습니다(가위)");
            } else if (Objects.equals(bHand, "바위")) {
                System.out.println("b 이겼습니다");

            } else if (Objects.equals(bHand, "보")) {
                System.out.println("a 이겼습니다");

            } else {
                System.out.println("b가 잘못 입력 했습니다.");
            }
        } else if (Objects.equals(aHand, "바위")) {
            if (Objects.equals(bHand, "가위")){
                System.out.println("a 승");
            } else if (Objects.equals(bHand, "바위")) {
                System.out.println("비김(바위)");

            } else if (Objects.equals(bHand, "보")) {
                System.out.println("b 승");

            } else {
                System.out.println("b가 잘못 입력 했습니다.");
            }
        } else if (Objects.equals(aHand, "보")){
            if (Objects.equals(bHand, "가위")){
                System.out.println("b 승");
            } else if (Objects.equals(bHand, "바위")) {
                System.out.println("a 승");

            } else if (Objects.equals(bHand, "보")) {
                System.out.println("비김(보)");

            } else {
                System.out.println("b가 잘못 입력 했습니다.");
            }
        } else {
            System.out.println("a가 잘못 입력 했습니다.");
        }


    }
}
