public class RoundHole {
    private double radius;
    RoundHole(double radius) { this.radius = radius; }
    private double getRadius() { return radius; }
    public boolean fits (RoundPeg peg){ return getRadius()>=peg.getRadius(); }
}