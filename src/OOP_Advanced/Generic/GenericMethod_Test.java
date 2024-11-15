package OOP_Advanced.Generic;

import static OOP_Advanced.Generic.GenericMethod.firstStringPrint;

public class GenericMethod_Test {

    public static void main(String[] args) {
        GenericMethod gMethod = new GenericMethod();

        String[] names = {"자바", "파이썬", "CPP", "C#", "JS"};
        Double[] scores = {150D, 98D, 95D, 90D, 100D};

        gMethod.print(names);
        gMethod.print(scores);

        firstStringPrint(names[0]);
    }
}
