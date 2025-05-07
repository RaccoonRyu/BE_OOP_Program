package Java_Post_Advanced2.CH02_Collection.compare;

import java.util.Arrays;
import java.util.Comparator;

// 배열에 들어있는 데이터를 오름차순으로 정렬하는 예제
public class SortMain2 {
    public static void main(String[] args) {
        Integer[] array = {3, 2, 1};
        System.out.println(Arrays.toString(array));
        System.out.println("Comparator 비교");
        // Arrays.sort() 함수에 두 번째 인자로 비교자를 직접 넣어줄 수 있다.
        // 이 경우 인자로 넣은 비교자를 사용하여 비교 및 정렬한다.
        // 비교자(Comparator) : 두 값을 비교할 때 비교 기준을 직접 제공하는 인터페이스
        // 두 인수를 비교해서 결과 값을 반환한다. int compare(T o1, T o2) -> 첫 번째 인수가 더 작으면 음수, 두 값이 같으면 0, 첫 번째 인수가 더 크면 양수 반환
        Arrays.sort(array, new AscComparator());
        System.out.println("AscComparator : " + Arrays.toString(array)); // [1, 2, 3] 출력

        Arrays.sort(array, new DescComparator());
        System.out.println("DescComparator : " + Arrays.toString(array)); // [3, 2, 1] 출력

        // 비교자.reversed() : 현재 비교자의 반대 방향으로 비교 및 정렬하는 함수
        Arrays.sort(array, new AscComparator().reversed()); // DescComparator과 같다.
        System.out.println("AscComparator.reversed() : " + Arrays.toString(array)); // [3, 2, 1] 출력
    }

    // 오름차순 비교자 AscComparator
    static class AscComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            System.out.println("o1 = " + o1 + ", o2 = " + o2);
            return (o1 < o2) ? -1 : ((o1 == o2) ? 0 : 1); // 앞의 값(o1)이 뒤의 값(o2)보다 더 작으면 -1, 같으면 0, 크면 1을 반환한다.
            // 결과로 -1을 반환할 경우 o1의 값이 앞에 위치하게 되고, 1을 반환할 경우 o1의 값이 뒤에 위치하게 된다.
        }
    }

    // 내림차순 비교자 DescComparator
    static class DescComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            System.out.println("o1 = " + o1 + ", o2 = " + o2);
            return (o1 < o2) ? -1 : ((o1 == o2) ? 0 : 1) * -1; // 앞의 값(o1)이 뒤의 값(o2)보다 더 작으면 1, 같으면 0, 크면 -1을 반환한다.
            // 결과로 -1을 반환할 경우 o1의 값이 뒤에 위치하게 되고, 1을 반환할 경우 o1의 값이 앞에 위치하게 된다.
        }
    }
}
