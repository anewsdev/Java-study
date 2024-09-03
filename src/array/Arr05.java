package array;

public class Arr05 {
    public static void main(String[] args) {
        //다차원 배열

        int[][] array = new int[2][3]; //최초 2차원 배열 선언

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                System.out.println("i = " + i+"/j = " + j);
                array[i][j] = 0; //i, j 는 위 노란색 네모박스 안에있는 숫자를 의미하며 인덱스라고 부릅니다.
            }
        }

    }
}
