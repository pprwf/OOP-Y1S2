public class Exam4_Main {
    public static void main(String[] args) {
        Exam4_Cat c = new Exam4_Cat();
        c.defineCat("Mew", "White");
        c.speak();
        
        c.upWeight(5);
        c.upHeight(10);
        c.speak();
        
        c.upWeight(-5);
        c.upHeight(-10);
        c.speak();
    }
}
