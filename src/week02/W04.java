package week02;

public class W04 {
    public static void main(String[] args) {
        // 기타 연산자
        // (1) 형변환 연산자

        int intNum = 93 + (int)98.8;
        System.out.println("intNum = " + intNum);

        double doubleNum = (double) 93 + 98.8;
        System.out.println("doubleNum = " + doubleNum);
        System.out.println("-----------------------------");

        // (2) 삼항 연산자
        // 비교연산자와 항상 함께 쓰인다.
        // 비교연산자의 결과 : true or false -> 이 결과의 값에 따라 결정되는 무언가!
        // 조건 ? 참 : 거짓

        int x = 1;
        int y = 9;

        boolean b = (x == y) ? true : false;
        System.out.println("b = " + b);

        String s = (x != y) ? "정답" : "오답";
        System.out.println("s = " + s);

        int max = (x > y) ? x : y;
        System.out.println("max = " + max);

        int min = (x < y) ? x : y;
        System.out.println("min = " + min);


        // (3) instance of (3주차)
    }
}
