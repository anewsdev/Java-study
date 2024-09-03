package Collection;

import java.util.LinkedList;
import java.util.Queue;

public class Col04 {
    public static void main(String[] args) {
        //Queue : FIFO
        //add, peek, poll
        //Queue : 생성자가 없는 인터페이스

        Queue<Integer> inteQueue = new LinkedList<Integer>(); //큐를 선언, 생성

        inteQueue.add(1);
        inteQueue.add(5);
        inteQueue.add(9);

        while (!inteQueue.isEmpty()) {
            System.out.println(inteQueue.poll());
        }
        System.out.println(inteQueue.toString());

        //추가
        inteQueue.add(1);
        inteQueue.add(5);
        inteQueue.add(9);

        //peek
        System.out.println(inteQueue.peek());
        System.out.println(inteQueue.size());

    }
}
