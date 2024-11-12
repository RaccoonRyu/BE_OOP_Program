package OOP_Basic;

public class OOP_Array {
    public static void main(String[] args) {
        // 배열
        // 선언
        int[] arr1;

        String[] str1;
        String str2[];

        // 초기화 및 값 할당
        arr1 = new int[5]; // 5개의 배열 공간
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 25;
        arr1[3] = 30;
        arr1[4] = 45;

        // 출력
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println(arr1[3]);
        System.out.println(arr1[4]);

        // for문 이용한 출력
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        // 배열의 선언과 초기화를 함께 수행
        int arr2[] = {10, 20, 25, 30, 45};
        System.out.println("============================");

        // for문 이용한 출력
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr2[i]);
        }

        // 얕은 복사 : 값 자체가 아니라 값을 가리키는 주소를 복사
        int[] arr3 = arr1;

        // 깊은 복사 : 값 자체를 복사
        int[] arr4 = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr4[i] = arr1[i];
        }
    }
}
