package FactoryMethod;

public class TriangleShapFactory implements ShapFactory{
    @Override
    public Shape getShape() {
        return new TriangleShape();
    }
}
