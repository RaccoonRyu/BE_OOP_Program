package Java_Post_Advanced2.CH01_Generic.test.ex3;

import Java_Post_Advanced2.CH01_Generic.test.ex3.unit.BioUnit;

public class UnitUtil {

    public static <T extends BioUnit> T maxHp(T t1, T t2) { // 입력하는 유닛의 타입과 반환하는 유닛의 타입이 동일
        if (t1.getHp() > t2.getHp()) { // 상한을 지정했기 때문에 상한인 BioUnit에 있는 getHp() 호출 가능
            return t1;
        } else {
            return t2;
        }
    }
}
