package Collection;

import java.util.HashSet;
import java.util.Set;

public class Col05 {
    public static void main(String[] args) {
        // set => 집합 : 순서없고, 중복 없음!
        // 순서가 보장되지 않는 대신 중복을 허용하지 않도록 하는 프로그램에서 사용할 수 있는 자료구조
        // Set => 그냥 쓸 수도 있음. 그러나, HashSet, TreeSet 등으로 응용해서 같이 사용 가능
        // Set 생성자가 없는 껍데기라서 바로 생성할 수 없음!
        // 생성자가 존재하는 HashSet 이용해서 => set 구현

        Set<Integer> intSet = new HashSet<>();

        intSet.add(1);
        intSet.add(12);
        intSet.add(5);
        intSet.add(6);
        intSet.add(1);
        intSet.add(12);

        for (Integer value : intSet){
            System.out.println(value);
        }

        System.out.println("--------------------------");
        //contains => 이 집합에 해당 값이 있는지 true, false로 확인
        System.out.println(intSet.contains(2));
        System.out.println(intSet.contains(5));

    }
}
