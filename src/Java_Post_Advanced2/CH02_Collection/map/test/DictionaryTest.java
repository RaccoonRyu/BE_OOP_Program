package Java_Post_Advanced2.CH02_Collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryTest {
    public static void main(String[] args) {
        Map<String, String> dict = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("=== 단어 입력 단계 ===");
        while(true) {
            System.out.print("영어 단어를 입력하세요. (종료는 'q' 입력) : ");
            String enWord = sc.nextLine();

            if("q".equals(enWord)) {
                break;
            }

            System.out.print("한글 뜻을 입력하세요. : ");
            String koWord = sc.nextLine();

            dict.put(enWord, koWord);
        }

        System.out.println("=== 단어 검색 단계 ===");
        while(true) {
            System.out.print("찾을 영어 단어를 입력하세요. (종료는 'q' 입력) : ");
            String searchWord = sc.nextLine();

            if("q".equals(searchWord)) {
                break;
            }

            if(dict.containsKey(searchWord)) {
                String koMeaning = dict.get(searchWord);
                System.out.println(searchWord + "의 뜻 : " + koMeaning);
            } else {
                System.out.println(searchWord + "은(는) 사전에 없는 단어입니다.");
            }
        }
    }
}