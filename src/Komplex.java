public class Komplex {

    double a;

    double b;



//    double subtraktion = (a + b * i) - (c + d * i) = (a - c) + (b - d) * i;

 //   double multiplikation = (a + b * i) * (c + d * i) = a * c + b * c * i + a * d * i + b * d * i^2 = (a * c - b * d) + (b * c + a * d) * i;

  //  double division = (a + b * i) / (c + d * i) = ((a + b * i) * (c - d * i)) / ((c + d * i) * (c - d * i)) = (a * c + b * d) / (c^2 + d^2) + (b * c - a * d) / c^2 + d^2) * i;

    public Komplex(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Komplex add(Komplex z) {
        return new Komplex(a+z.a,b+z.b);
    }

    public Komplex multiply(Komplex z) {
        return new Komplex(a*z.a, b*z.b);
    }

    public double arg() {
        return new double;
    }
}
