package Java_Post_Advanced2.CH01_Generic.ex4;

import Java_Post_Advanced2.CH01_Generic.animal.Animal;

// 제네릭 타입과 제네릭 메서드의 우선 순위
// 제네릭 타입과 제네릭 메서드의 타입 매개변수를 같은 이름으로 사용하면?
// -> 제네릭 메서드가 우선 순위를 가진다!

// 상한으로 Animal을 설정한 제네릭 타입
public class ComplexBox<T extends Animal> { // 제네릭 타입을 T로 선언

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public <T> T printAndReturn(T t) { // 제네릭 메서드를 T로 선언
        // 이 때 제네릭 메서드의 타입 매개변수 T는 상한이 없어 Object로 취급된다. -> Animal 메서드 호출 불가
        System.out.println("animal.className : " + animal.getClass().getName());
        System.out.println("t.className = " + t.getClass().getName());

        return t;
    }
}
