package FactoryMethod;

public class Cilent {

    public static void main(String[] args) {
        ShapFactory shapFactory = new RectShapFactory();
        Shape shape = shapFactory.getShape();
        shape.draw();;
    }
}
