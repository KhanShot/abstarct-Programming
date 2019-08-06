public class Test {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(17.7);
        SquarePeg squarePeg = new SquarePeg(25);
        RoundPeg peg = new RoundPeg(15);
        Boolean out = hole.fits(peg);
        if(out) System.out.println("Domalak Domalaktyn iwinde!");
        AdapterSquarPeg ad = new AdapterSquarPeg(squarePeg);
        Boolean sqout = hole.fits(ad);
        System.out.println(sqout);
        double a = ad.getRadius();
        System.out.println(a);
        double b = ad.getDiagonal();
        System.out.println(b);
        if(sqout) System.out.println(true);
        else System.out.println(false);
//        TrianglePeg pag = new TrianglePeg(24);
//        AdapterTrianglePeg adtp = new AdapterTrianglePeg(pag);
//        double ads = adtp.getDiagonal();
//        double bds = adtp.getRadius();
//        boolean ai = hole.fits(adtp);
//        if(ai) System.out.println("Yes, Its IN the Circle");
//        System.out.println(ads);
//        System.out.println(bds);
    }
}