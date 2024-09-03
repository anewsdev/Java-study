package homework;

import java.util.*;

public class Homework02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("저장할 자료구조명을 입력합니다. (List / Set / Map) :");
        String collectionName = sc.nextLine();
        System.out.print("좋아하는 요리를 입력해주세요 :");
        String title = sc.nextLine();

        switch (collectionName) {
            case "List":
                ArrayList<String> strList = new ArrayList<>();
                while (true) {
                    // 한줄씩 입력받아서 strList 에 저장
                    System.out.print("요리 레시피를 한 문장씩 입력해 주세요 다 입력 했다면 끝이라고 작성해 주세요. :");
                    String text = sc.nextLine();
                    if (Objects.equals(text, "끝")) {
                        break;
                    }
                    strList.add(text);
                }

                title = "[ List로 저장된 " + title + " ]";  // [ 제목 ]
                System.out.println(title);
                // strList 한줄씩 출력
                for (int i = 0; i < strList.size(); i++) {
                    int number = i + 1;
                    System.out.println(number + ". " + strList.get(i));
                }
                break;
            case "Set":
                LinkedHashSet<String> strSet = new LinkedHashSet<>();
                while (true) {
                    // 한줄씩 입력받아서 strList 에 저장
                    String text = sc.nextLine();
                    if (Objects.equals(text, "끝")) {
                        break;
                    }
                    strSet.add(text);
                }

                title = "[ Set 으로 저장된 " + title + " ]";  // [ 제목 ]
                System.out.println(title);

                Iterator iterator = strSet.iterator();
                // strList 한줄씩 출력
                for (int i = 0; i < strSet.size(); i++) {
                    int number = i + 1;
                    System.out.println(number + ". " + iterator.next());
                }
                break;
            case "Map":
                Map<Integer, String> strMap = new HashMap<>();
                int lineNumber = 1;
                while (true) {
                    // 한줄씩 입력받아서 strList 에 저장
                    String text = sc.nextLine();
                    if (Objects.equals(text, "끝")) {
                        break;
                    }
                    strMap.put(lineNumber++, text);
                }

                title = "[ Map 으로 저장된 " + title + " ]";  // [ 제목 ]
                System.out.println(title);

                // strList 한줄씩 출력
                for (int i = 0; i < strMap.size(); i++) {
                    int number = i + 1;
                    System.out.println(number + ". " + strMap.get(i + 1));
                }
                break;
            default:
                System.out.println("저장할 수 없는 자료구조 입니다.");
        }
    }
}
