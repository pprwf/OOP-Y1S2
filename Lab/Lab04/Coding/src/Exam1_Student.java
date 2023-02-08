public class Exam1_Student {
    public String name;
    public double mScore, fScore, score;
    public void showGrade() {
        score = (mScore * 0.4) + (fScore * 0.4) + 20;
        System.out.println("Your grade is " + score);
    }
}
