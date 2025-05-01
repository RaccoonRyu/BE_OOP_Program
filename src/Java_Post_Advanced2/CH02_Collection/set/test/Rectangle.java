package Java_Post_Advanced2.CH02_Collection.set.test;

import java.util.Objects;

public class Rectangle {

    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return width == rectangle.width && height == rectangle.height;
    }

    // HashSet 자료 구조에 저장되기 때문에 hash 알고리즘을 사용하므로 hashCode와 equals의 재정의 필요
    // 재정의하지 않으면 Rectangle 객체별로 저장된다. (중복 저장을 방지하지 못한다.)
    @Override
    public int hashCode() {
        return Objects.hash(width, height);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
