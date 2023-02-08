public class Exam2_Main {
    public static void main(String[] args) {
    Exam2_Fraction f1 = new Exam2_Fraction();
    f1.topN = 2;
    f1.btmN = 5;
    Exam2_Fraction f2 = new Exam2_Fraction();
    f2.topN = 3;
    f2.btmN = 7;
        System.out.println("before " + f1.toFraction());
        System.out.println("before " + f1.toFloat());
        f1.addFraction(f2);
        System.out.println("after " + f1.toFraction());
        System.out.println("after " + f1.toFloat());
}
}
