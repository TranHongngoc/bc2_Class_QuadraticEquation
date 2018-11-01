public class QuadraticEquation {
    private double a,b,c;
    private double delta;
    public QuadraticEquation(){

    }

    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void setA(double a){
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant(){
        return delta = b*b -4*a*c;
    }
    public double root1(){
        return (-b + Math.pow(delta,0.5))/(2*a);
    }

    public double root2(){
        return (-b - Math.pow(delta,0.5))/(2*a);
    }

}
