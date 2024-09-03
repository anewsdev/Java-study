package week02;

public class W08_for {
    public static void main(String[] args) {

        // for문

//        for (int i = 0; i < 4; i++){
//            System.out.println(i + "번째 출력!");
//            }
//        }

        //향상된 for문
        //기존 : for문 안에 3개의 표현 -> (초기값 ; 조건문 ; 증가연산)
        //향상된 for문 : 2개의 표현

        int[] numbers = {3, 6, 9, 12, 15};
        //for (int (for문안에서 쓸 변수명):변수명)
        for (int number: numbers){
            System.out.println(number);
        }
        //위와 같은 출력을 기존 for문으로
        for(int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}
