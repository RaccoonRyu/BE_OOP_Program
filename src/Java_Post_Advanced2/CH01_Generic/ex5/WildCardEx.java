package Java_Post_Advanced2.CH01_Generic.ex5;

import Java_Post_Advanced2.CH01_Generic.animal.Animal;

// 와일드 카드 : 프로그래밍에서 *, ?과 같이 하나 이상의 문자들을 상징하는 특수 문자.
// 일반적으로 *, ?과 같은 특수 문자가 있으면 해당 문자에 아무 문자나 들어올 수 있음을 의미한다.
// 따라서 제네릭에서 와일드 카드를 적용하면 이런 특수 문자에 여러 타입이 들어올 수 있다는 뜻이다.
public class WildCardEx {

    // Box<T>라는 제네릭 타입을 받고, 해당 제네릭 타입에 들어있는 값을 꺼내 출력하는 제네릭 메서드
    static <T> void printGenericV1(Box<T> box) {
        System.out.println("T = " + box.get());
    }

    // 해당 메서드에서 사용한 ?(물음표)는 와일드 카드
    // 이 때 물음표에는 Box와 관련된 어떤 타입이든 들어올 수 있음을 의미 (ex Box<Dog>, Box<Cat>, Box<Object>) - 비제한 와일드 카드
    // 해당 메서드는 제네릭 메서드가 아닌 일반 메서드이다.
    static void printWildcardV1(Box<?> box) {
        System.out.println("? = " + box.get());
    }

    // V1에서 타입 매개변수 제한을 Animal로 추가한 제네릭 메서드
    static <T extends Animal> void printGenericV2(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName()); // 제한을 Animal로 두었기 때문에 Animal의 getName() 메서드 사용 가능
    }

    // 와일드 카드 또한 들어오는 값을 제한할 수 있다. - 제한 와일드 카드
    // 여기서는 <? extends Animal> 을 사용하여 Animal과 Animal의 자식 타입은 모두 들어오게 할 수 있다.
    // 다른 타입 입력 시 컴파일 에러 발생
    // 와일드카드는 get()으로 꺼낼 때 제한을 둔 타입(최대 부모 타입)으로 꺼낸다. 따라서 아래 함수에서는 Animal 타입을 get()으로 꺼내어 반환해준다.
    // 결과적으로 Animal 타입의 기능을 호출할 수 있다.
    static void printWildCardV2(Box<? extends Animal> box) {
        Animal animal = box.get(); // Box에서 바로 Animal을 꺼낼 수 있음
        System.out.println("이름 = " + animal.getName());
    }

    // V2에서 T 반환을 추가한 제네릭 메서드 (출력 + 반환)
    static <T extends Animal> T printAndReturn(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName());
        return t;
    }

    static Animal printAndReturnWildcard(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
        return animal;
    }

    // 와일드 카드는 제네릭 타입이나 제네릭 메서드를 선언하는 것이 아니다.
    // 이미 만들어진 제네릭 타입을 활용할 때 사용한다.
    // 즉, 와일드 카드는 제네릭을 쉽게 쓸 수 있게 도와주는 도구다.

    // 제네릭 메서드와의 차이
    // 제네릭 메서드는 사용 시 타입 매개변수에 타입 인자를 전달하여 타입을 결정해야 함 -> 입력된 타입을 그대로 반환하고 싶을 때 사용함
    // 와일드 카드는 단순히 매개변수로 제네릭 타입을 받을 수 있는 것이고, 이미 타입 인자가 정해진 제네릭 타입을 전달 받아 사용함
    // -> 타입이 정해진 채로 들어오는 값을 받아서 사용만 하기 때문에 입력한 타입을 그대로 반환하려면 캐스팅이 필요함
}
