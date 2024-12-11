package Java_Post_Advanced1.CH01_Object.lang.object.tostring;

public class Dog {

    private String dogName;
    private int age;

    public Dog(String dogName, int age) {
        this.dogName = dogName;
        this.age = age;
    }

    // toString()은 오버라이딩하여 객체의 세부적인 정보를 표현할 때 사용할 수 있다!
    @Override
    public String toString() {
        return "Dog{" +
                "dogName='" + dogName + '\'' +
                ", age=" + age +
                '}';
    }
}
