package FactoryMethod;

public class CircleShapeFactory implements ShapFactory {
    @Override
    public Shape getShape() {
        return new CircleShape();
    }
}
