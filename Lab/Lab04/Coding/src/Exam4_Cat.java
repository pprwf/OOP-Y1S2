public class Exam4_Cat {
    private String name, color;
    public double height, weight;
    private void setWeight(double w) {
        if (w > 0) {
            weight = w;
            } else {
            System.out.println("Error");
        }
    }
    private void setHeight(double h) {
        if (h > 0) {
            height = h;
        } else {
            System.out.println("Error");
        }
    }
    private void setName(String n) {
        name = n;
    }
    private void setColor(String c) {
        color = c;
    }
    public void upWeight(double w) {
        setWeight(weight + w);
    }
    public void downWeight(double w) {
        setWeight(weight - w);
    }
    public void upHeight(double h) {
        setHeight(height + h);
    }
    public void defineCat(String n, String c) {
        setName(n);
        setColor(c);
    }
    public void speak() {
        System.out.println("Name : " + name);
        System.out.println("Color : " + color);
        System.out.println("Height : " + height);
        System.out.println("Weight : " + weight);
    }
}
