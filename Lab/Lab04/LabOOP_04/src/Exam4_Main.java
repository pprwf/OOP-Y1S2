public class Exam4_Main {
    public static void main(String[] args) {
        Cat c = new Cat();
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
