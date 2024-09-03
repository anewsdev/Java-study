package Collection;

import java.util.Stack;

public class Col03 {
    public static void main(String[] args) {
        //Stack
        //수직으로 값을 쌓아놓고, 넣었다가 뺀다, FIFO(BASKET)
        //push, peek, pop
        //최근 저장된 데이터를 나열하고 싶거나, 데이터의 중복 처리를 막고 싶을 때 사용

        Stack<Integer> intStack = new Stack<>(); //선언 및 생성

        intStack.push(10);
        intStack.push(15);
        intStack.push(1);

        while (!intStack.isEmpty()){
            System.out.println(intStack.pop());//상단에 있는것만 빼준다 리턴되면서 스택에서는 빠진다
        }
        System.out.println(intStack.toString());// 값이 없음

        intStack.push(10);
        intStack.push(15);
        intStack.push(1);

        //peak
        System.out.println(intStack.peek());
        System.out.println(intStack.size());




    }
}
