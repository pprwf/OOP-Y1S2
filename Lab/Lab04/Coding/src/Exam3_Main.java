public class Exam3_Main {
    public static void main(String[] args) {
        Exam2_Fraction f1 = new Exam2_Fraction();
        f1.topN = 1;
        f1.btmN = 3;
        
        Exam2_Fraction f2 = new Exam2_Fraction();
        f2.topN = 4;
        f2.btmN = 16;
        
        Exam2_Fraction f3 = new Exam2_Fraction();
        f3.topN = 5;
        f3.btmN = 15;
        
        System.out.println(f1.toFloat());
        System.out.println(f2.toFloat());
        System.out.println(f3.toFloat());
        
        System.out.println("f1 is equal to f2 >> " + f1.myEquals(f2));
        System.out.println("f1 is equal to f3 >> " + f1.myEquals(f3));
        
        System.out.println("Before : " + f2.toFraction());
        f2.LowestTermFrac();
        System.out.println("After : " + f2.toFraction());
}
}
