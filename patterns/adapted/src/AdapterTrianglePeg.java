public class AdapterTrianglePeg extends RoundPeg {
    private TrianglePeg peg;
    AdapterTrianglePeg(TrianglePeg peg){ this.peg = peg; }
    public double getDiagonal(){
        double c = peg.getWidth();
        double a = peg.getWidth()/2;
        double b = Math.pow(c,2) - Math.pow(a,2);
        return Math.pow(b,0.5);
    }
    public double getRadius(){
        double a = getDiagonal();
        return a*2/3;
    }
}
