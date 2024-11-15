package OOP_Advanced.Collections;

// 정렬을 위한 Comparable 인터페이스 상속
// 사용례 : Comparable<클래스명> (제네릭)
public class Student implements Comparable<Student> {

    private int no;
    private String name;

    public Student (int no, String name) {
        this.no = no;
        this.name = name;
    }

    // Comparable을 상속 받았기 때문에 compareTo라는 메서드 작성이 의무됨
    @Override
    public int compareTo(Student o) {
        // 학번으로 비교하도록 작성
        return this.no - o.no; // 오름차순
        //return o.no - this.no; // 내림차순
    }

    // toString 오버라이딩
    @Override
    public String toString() {
        return String.format("학번 : %d, 이름 : %s", no, name);
    }
}
