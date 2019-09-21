package FactoryMethod;

public class RectShapFactory implements ShapFactory {
    @Override
    public Shape getShape() {
        return new RectShape();
    }
}
