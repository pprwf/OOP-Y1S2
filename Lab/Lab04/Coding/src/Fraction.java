public class Fraction {
    public int topN;
    public int btmN;
    public String toFraction() {
        return topN + "/" + btmN;
    }
    public String toFloat() {
        return (1.0 * topN / btmN) + "";
    }
    public void addFraction(Fraction f) {
        if (btmN == f.btmN) {
            topN += f.topN;
        }
        else {
            topN = topN * f.btmN + f.topN * btmN;
            btmN *= f.btmN;
        }
    }
    public boolean myEquals(Fraction x) {
        return (1.0 * topN / btmN) == (1.0 * x.topN / x.btmN);
    }
    public void LowestTermFrac() {
        for (int num = topN; num > 0; num--) {
            if (topN % num == 0) {
                topN /= num;
                btmN /= num;
            }
        }
    }
}
