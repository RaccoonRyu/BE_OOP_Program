package OOP_Advanced.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student(2, "홍길동2")); // Student를 생성해서 바로 List에 add
        studentList.add(new Student(1, "홍길동1"));
        studentList.add(new Student(3, "홍길동3"));
        studentList.add(new Student(5, "홍길동5"));
        studentList.add(new Student(4, "홍길동4"));

        for (Student std : studentList) {
            System.out.println(std.toString());
        }

        // 학번으로 비교하는 compareTo 함수를 통한 정렬
        // Collections.sort() 이용하여 정렬하기 위해서는 정렬하고싶은 클래스에 대해
        // Comparable이라는 인터페이스를 상속받고, compareTo라는 메서드를 오버라이딩해주어야 한다.
        Collections.sort(studentList); // List 인터페이스 상속받았으므로 정렬 가능
        for (Student std : studentList) {
            System.out.println(std.toString());
        }
    }
}
