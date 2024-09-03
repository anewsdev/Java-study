import week03.Car;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

//클래스
//public : 제어자, 어디까지 접근하게 할 것 인가. public(공공의, 공통의)
public class Main {

// [JDK]
//    (1) compiler : .java -> .class 자바 파일을 클래스 파일로 컴파일
//    (2) JRE
//    (3) JDB : 디버깅

//    () : 소괄화
//    {} : 중괄호
//    [] : 대괄호

    // main 메소드
    // 자바 프로젝트(앱)는, 제일 먼저 클래스의 main 메소드를 실행시킨다.
    // = JVM의 약속
    // static : 이 프로그램이 시작될 때 무조건 실행되는 녀석임을 표현

    //output
    // void : 메서드의 출력값의 데이터 타입
    // void : "아무것도 없도." -> 출력은 없다.

    // input
    // (String[] args) : 매개변수 자리
    public static void main(String[] args) {

        // 객체 : 특징(속성, 변수), 행동(메소드)

        //1. 7
        //2. 3
        //3. 3.14
        //4. JAVA

//        System.out.println("7");
//        System.out.println("3");
//        System.out.println("3.14");
//        System.out.println("JAVA");

        // 변수
        // (1) 참,거짓(boolean)
        // 변수를 선언해보자 => 타입이름 = 값;
//        boolean flag = true;
//        flag = false;
//
//        System.out.println(flag);

        //(2) 문자형(char)
//        char alphbet = 'A';
//        System.out.println(alphbet);

        //(3) 정수형(byte, shorte, int, long)
//        byte byteNum = 127;//-127~128 까지 256개의 숫자 표현
//        short shorteNum = 32767;
//        int intNum = 214784848;
//        long longNum = 22423423L;
//
//        System.out.println("longNum = " + byteNum);
//        System.out.println("shorteNum = " + shorteNum);
//        System.out.println("intNum = " + intNum);
//        System.out.println("longNum = " + longNum);

        //(4) 실수형(float(4byte), double(8byte)
//        float floatNum = 0.123F;
//        double doubleNum = 0.21412312;
//
//        System.out.println("floatNum = " + floatNum);
//        System.out.println("doubleNum = " + doubleNum);

        //참조형
        //(1) 문자열
//        String helloWorld = "Hello World";
//        System.out.println(helloWorld);

        //(2) 배열
//        int[] a = {1, 2, 3};
//        System.out.println(a);
//        // 결과 = 주소값 [I@4c873330
//        System.out.println(Arrays.toString(a));
//        // 결과 = [1, 2, 3]

        //래퍼 클래스(Wrapper Class 변수)
//        int numbur = 21;
//        Integer num = numbur; //boxing
//        //Integer num = new Integer(number); > 옛날 방식 실행은 가능하나 오류도 같이 뜸
//        System.out.println(num.intValue()); //unboxing


//        //스캐너 호출
//        Scanner sc = new Scanner(System.in);
//        // 요리제목 입력
//        String title = sc.nextLine();
//        // 요리점수 (실수)
//        float rate = sc.nextFloat(); // Float 실수는 nextFloat() 메서드로 받습니다.
//
//        //요리 방법
//        String cookInfo1 = sc.nextLine();
//        String cookInfo2 = sc.nextLine();
//        String cookInfo3 = sc.nextLine();
//        String cookInfo4 = sc.nextLine();
//        String cookInfo5 = sc.nextLine();
//        String cookInfo6 = sc.nextLine();
//        String cookInfo7 = sc.nextLine();
//        String cookInfo8 = sc.nextLine();
//        String cookInfo9 = sc.nextLine();
//        String cookInfo10 = sc.nextLine();
//
//
//        System.out.println("[ " + title + " ]");
//        int intRate = (int)rate;
//        //요리 점수 퍼센티지 전환
//        double percent = intRate * 100 / 5.0;
//        System.out.println("별점 :"+rate+"("+percent+"%)");
//
//        System.out.println("1. " + cookInfo1);
//        System.out.println("2. " + cookInfo2);
//        System.out.println("3. " + cookInfo3);
//        System.out.println("4. " + cookInfo4);
//        System.out.println("5. " + cookInfo5);
//        System.out.println("6. " + cookInfo6);
//        System.out.println("7. " + cookInfo7);
//        System.out.println("8. " + cookInfo8);
//        System.out.println("9. " + cookInfo9);
//        System.out.println("10. " + cookInfo10);

//        -------------------------------------------------------------------------------



    }
}