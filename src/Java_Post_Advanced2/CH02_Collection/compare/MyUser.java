package Java_Post_Advanced2.CH02_Collection.compare;

// 사용자 정의 클래스를 비교하기 위해 Comparable을 구현한다.
// 이 때 Comparable<정렬하려는 클래스 타입>을 구현한다.
public class MyUser implements Comparable<MyUser> {
    private String id;
    private int age;

    public MyUser(String id, int age) {
        this.id = id;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // compareTo() : 파라미터를 통해 넘어온 MyUser 타입의 객체와 비교한다.
    // 이 때 비교의 기준은 "나이"로 설정하여 해당 메서드를 구현한다. (나이 오름차순)
    @Override
    public int compareTo(MyUser o) {
        return this.age < o.age ? -1 : (this.age == o.age ? 0 : 1);
    }

    @Override
    public String toString() {
        return "MyUser{" +
                "id='" + id + '\'' +
                ", age=" + age +
                '}';
    }
}
