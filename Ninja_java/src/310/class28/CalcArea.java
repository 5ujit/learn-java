abstract class CalcArea {
    abstract void triangleArea(double c,double b);
    abstract void RectangleArea(double l,double c,double b);
    abstract void SquareArea(double c,double b);
    abstract void circleArea(double c,double b);
}
class findarea extends CalcArea{
    void triangleArea(double c,double b){
        System.out.println(0.5*c*b);
    }
    void RectangleArea(double l,double c,double b){
        System.out.println(l*b*c);
    }
    void SquareArea(double c,double b){
        System.out.println(c*b);
    }
    void SquareArea(double c,double b){
        System.out.println();
    }
}
