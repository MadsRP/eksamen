public class Circle implements Shape {

    int radius;

    public Circle(){

    }

    public Circle(int radius){
        this.radius = radius;
    }


    @Override
    public double getArea() {
        double area;
        return area = Math.PI*radius*radius;
    }
}
