package array;

import java.util.Arrays;

public class Arr03 {
    public static void main(String[] args) {
        // 얕은 복사
        int[] a = {1,2,3,4};
        int[] b = a; //얕은 복사

        b[0] = 3;

        System.out.println(a[0]);
        // a 배열에 1, 2, 3, 4 를 선언하고 고유의 주소값이 생김
        // b에 a를 대입하였지만 값이 아닌 주소값이 복사되어 서로 같은 배열을 공유함
        // b 배열의 0번째 값을 3으로 변경하면 a 값도 변경됨
        // 그래서 a의 0번째 값을 출력하면 3이 나옴
        // 이게 얕은 복사

        // 깊은 복사
        int[] c = {1, 2, 3, 4};
        int[] d = new int[c.length];// d배열의 값을 c 배열의 길이만큼 복사하여 초기화 즉 int[] d = {0, 0, 0, 0}

        for(int i=0;i<c.length;i++){
            d[i] = c[i]; // 깊은 복사
        }

        d[0] = 3; // d 배열의 0번째 순번값을 3으로 수정

        System.out.println(c[0]);
        System.out.println("----------------");

        for(int i=0; i<d.length; i++){
            System.out.println(d[i]);// 변경된 0번째 값을 유지한채로 3,2,3,4 출력
        }

        // 깊은 복사 메서드
        // Arrays.copyOf() 메서드
        int[] aa = {1,2,3,4};
        int[] bb = Arrays.copyOf(aa, aa.length);//배열과 함께 length값도 같이 넣어줍니다.
        System.out.println("----------------------");
        for(int i=0; i<bb.length; i++){
            System.out.println(aa[i]);
            System.out.println("----------------------");
            System.out.println(bb[i]);
        }

    }
}
