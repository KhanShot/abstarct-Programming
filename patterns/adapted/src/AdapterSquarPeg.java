public class AdapterSquarPeg extends RoundPeg {
    private SquarePeg peg;
    AdapterSquarPeg(SquarePeg peg) {this.peg = peg;}
    public double getDiagonal() { return Math.pow((Math.pow(peg.getWidth(), 2) + Math.pow(peg.getWidth(), 2)), 0.5); }
    public double getRadius(){ return (getDiagonal()/2); }
}
