package array;

public class Arr07 {
    public static void main(String[] args) {
        //최대값 구하기

        int[] arr = {3,2,1,5,1};

        //최대값 초기화 세팅
        int max = arr[0]; //맥스 변수에 arr배열의 0번째 즉 3을 셋팅

        //최대값 구하기 로직
        for (int num: arr){
            //포문으로 max값과 num값을 비교
            if(num > max){ //num값이 max보다 크면
                max = num; //그 num 값을 max에 셋팅
            }
        }

        System.out.println("max = " + max);
    }
}
