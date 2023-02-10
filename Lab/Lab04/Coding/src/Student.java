public class Student {
    public String name;
    public double mScore;
    public double fScore;
    public void showGrade() {
        System.out.println("Your grade : " + ((mScore * 0.4) + (fScore * 0.4) + 20));
    }
}
