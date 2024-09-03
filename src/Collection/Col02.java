package Collection;

import java.util.LinkedList;

public class Col02 {
    public static void main(String[] args) {
        //linked list
        //메모리에 남는 공간을 요청해서 여기 저기 나누어서 실제 값을 담아놓는다.
        //실제 값이 있는 주소값으로 목록을 구성하고 저장하는 지료구조.

        //기본적 기능은 => ArrayList와 동일
        //Linked list 값 => 여기 저기 나누어서 : 조회하는 속도가 느리다
        // 값을 추가하거나, 삭제시 빠르다

        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        System.out.println("linkedList = " + linkedList.get(0));
        System.out.println("linkedList = " + linkedList.get(1));
        System.out.println("linkedList = " + linkedList.get(2));

        System.out.println(linkedList.toString()); //이렇게 조회할 때는 arrayList보다 속도가 느리다

        linkedList.add(200);
        linkedList.add(2,4);
        System.out.println(linkedList.toString());

        linkedList.set(1,30);
        System.out.println(linkedList.toString());

        linkedList.remove(1);
        System.out.println(linkedList.toString());

        linkedList.clear();
        System.out.println(linkedList.toString());
    }
}
