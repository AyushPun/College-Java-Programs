class Operation {
    int square(int n) {
        return n * n;
    }
}
class Prog10 {
    Operation op;// aggregation
    double pi = 3.14;

    double area(int radius) {
        int rsquare = (new Operation()).square(radius);// code reusability (i.e. delegates the method call).
        return pi * rsquare;
    }
    public static void main(String args[]) {
        Prog10 c = new Prog10();
        double result = c.area(5);
        System.out.println("Area of Circle of Radius" + " '5' = " + result);
    }
}