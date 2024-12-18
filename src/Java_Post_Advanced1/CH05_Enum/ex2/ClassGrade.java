package Java_Post_Advanced1.CH05_Enum.ex2;

public class ClassGrade {
    public static final ClassGrade BASIC = new ClassGrade(); //x001
    public static final ClassGrade GOLD = new ClassGrade(); //x002
    public static final ClassGrade DIAMOND = new ClassGrade(); //x003

    //private 생성자 추가
    private ClassGrade() {}
}
