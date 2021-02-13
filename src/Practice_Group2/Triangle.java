package Practice_Group2;

public class Triangle extends Shape {

    private Point a;
    private Point b;
    private Point c;

    public Triangle(){
    }

    public Triangle (Point a, Point b, Point c){
        this.a=a;
        this.b=b;
        this.c=c;
    }



    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle{" + "a=" + a + ", b=" + b + ", c=" + c + '}';
    }

    @Override
    double getPerimetr() {
        return Point.lengthBetweenPoints(a,b)+Point.lengthBetweenPoints(a,c)+Point.lengthBetweenPoints(c,b);
    }
    @Override
    double getArea() {
        double p = this.getPerimetr()/2.0;
        return Math.sqrt(p*(p - Point.lengthBetweenPoints(a,b))
                *(p - Point.lengthBetweenPoints(b,c))
                *(p - Point.lengthBetweenPoints(c,a)));
    }


}
